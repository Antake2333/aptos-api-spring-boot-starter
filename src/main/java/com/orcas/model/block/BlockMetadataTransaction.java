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
public class BlockMetadataTransaction implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String version;
    private String hash;
    @JSONField(name = "state_change_hash")
    private String stateChangeHash;
    @JSONField(name = "event_root_hash")
    private String eventRootHash;
    @JSONField(name = "state_checkpoint_hash")
    private String stateCheckpointHash;
    @JSONField(name = "gas_used")
    private String gasUsed;
    private Boolean success;
    @JSONField(name = "vm_status")
    private String vmStatus;
    @JSONField(name = "accumulator_root_hash")
    private String accumulatorRootHash;
    private List<Change> changes;
    private String id;
    private String epoch;
    private String round;
    private List<Event> events;
    @JSONField(name = "previous_block_votes_bitvec")
    private List<Integer> previousBlockVotesBitvec;
    private String proposer;
    @JSONField(name = "failed_proposer_indices")
    private List<Integer> failedProposerIndices;
    private String timestamp;
}
