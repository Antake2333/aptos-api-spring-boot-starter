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
public class Transaction implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String type;
    private String hash;
    private String sender;
    @JSONField(name = "sequence_number")
    private String sequenceNumber;
    @JSONField(name = "max_gas_amount")
    private String maxGasAmount;
    @JSONField(name = "gas_unit_price")
    private String gasUnitPrice;
    @JSONField(name = "expiration_timestamp_secs")
    private String expirationTimestampSecs;
    private Payload payload;
    private Object signature;
}
