package com.orcas.model.error;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class AptosError implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String message;
    @JSONField(name = "error_code")
    private String errorCode;
    @JSONField(name = "vm_error_code")
    private Integer vmErrorCode;
}
