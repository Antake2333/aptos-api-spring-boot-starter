package com.orcas.model.account;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class AccountData implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @JSONField(name = "sequence_number")
    private String sequenceNumber;
    @JSONField(name = "authentication_key")
    private String authenticationKey;
}
