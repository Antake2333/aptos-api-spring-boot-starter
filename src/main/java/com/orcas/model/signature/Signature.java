package com.orcas.model.signature;

import com.alibaba.fastjson.annotation.JSONField;
import com.orcas.constant.AptosApiConstant;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class Signature implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String type = AptosApiConstant.ED25519_SIGNATURE;

    @JSONField(name = "public_key")
    private String publicKey;

    private String signature = AptosApiConstant.ZERO_SIGNATURE;
}
