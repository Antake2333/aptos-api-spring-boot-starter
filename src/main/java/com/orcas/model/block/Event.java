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
public class Event implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Object guid;
    @JSONField(name = "sequence_number")
    private String sequenceNumber;
    private String type;
    private Object data;
}
