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
public class Block implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @JSONField(name = "block_height")
    private String blockHeight;
    @JSONField(name = "block_hash")
    private String blockHash;
    @JSONField(name = "block_timestamp")
    private String blockTimestamp;
    @JSONField(name = "first_version")
    private String firstVersion;
    @JSONField(name = "last_version")
    private String lastVersion;
    private List<Transaction> transactions;
}
