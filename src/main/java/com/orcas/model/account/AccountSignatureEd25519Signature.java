package com.orcas.model.account;

import com.orcas.model.signature.Signature;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountSignatureEd25519Signature extends Signature implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
