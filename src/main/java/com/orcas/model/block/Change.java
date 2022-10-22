package com.orcas.model.block;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class Change implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String type;
    private String address;
    @JSONField(name = "state_key_hash")
    private String stateKeyHash;
    private String module;
}
