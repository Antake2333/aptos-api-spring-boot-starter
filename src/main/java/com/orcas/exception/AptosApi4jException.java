package com.orcas.exception;

import com.alibaba.fastjson.JSON;
import com.orcas.error.AptosApiError;
import com.orcas.error.ErrorCode;
import com.orcas.model.error.AptosError;

/**
 * @author Orcas
 * @date 2022/10/22
 */
public class AptosApi4jException extends RuntimeException {

    private int code;

    public AptosApi4jException() {
    }

    public AptosApi4jException(int code, String message) {
        super(message);
        this.code = code;
    }

    public AptosApi4jException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
    }

    public AptosApi4jException(ErrorCode errorCode, Throwable throwable) {
        super(errorCode.getMsg(), throwable);
        this.code = errorCode.getCode();
    }

    public static AptosApi4jException paramError(String msg) {
        return new AptosApi4jException(AptosApiError.PARAMETER_ERROR.getCode(), msg);
    }

    public static AptosApi4jException paramError(AptosError error) {
        return new AptosApi4jException(AptosApiError.APTOS_ERROR.getCode(), JSON.toJSONString(error));
    }

    public static AptosApi4jException paramError(Integer code, String msg) {
        return new AptosApi4jException(code, msg);
    }

    public int getCode() {
        return code;
    }
}
