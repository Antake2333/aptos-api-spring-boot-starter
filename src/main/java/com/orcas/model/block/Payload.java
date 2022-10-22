package com.orcas.model.block;

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
public class Payload implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @JSONField(name = "type_arguments")
    private List<Object> typeArguments;
    private List<Object> arguments;
}
