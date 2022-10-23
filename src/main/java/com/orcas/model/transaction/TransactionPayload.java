package com.orcas.model.transaction;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class TransactionPayload implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String type;
    private String function;
    @JSONField(name = "type_arguments")
    private List<Object> typeArguments;
    private List<Object> arguments;
}
