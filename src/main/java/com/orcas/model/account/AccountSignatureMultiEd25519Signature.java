package com.orcas.model.account;

import com.alibaba.fastjson.annotation.JSONField;
import com.orcas.constant.AptosApiConstant;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class AccountSignatureMultiEd25519Signature implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String type = AptosApiConstant.MULTI_ED25519_SIGNATURE;
    @JSONField(name = "public_keys")
    private List<String> publicKeys;
    private List<String> signatures;
    private Integer threshold = 0;
    private String bitmap;
}
