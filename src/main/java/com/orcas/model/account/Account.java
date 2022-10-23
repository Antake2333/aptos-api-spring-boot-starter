package com.orcas.model.account;

import com.orcas.model.signature.Signature;
import com.orcas.util.CryptoUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@NoArgsConstructor
@Data
public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * string
     * <hex>
     */
    private String address;
    /**
     * 私钥hex
     */
    private String privateKey;
    /**
     * 公钥hex
     */
    private String publicKey;

    private Signature singleEd25519Signature;

    public Account(String address, String privateKey, String publicKey) {
        this.address = address;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public Signature getSingleEd25519Signature() {
        if (singleEd25519Signature != null) {
            return singleEd25519Signature;
        }
        Signature accountSignature = new Signature();
        accountSignature.setPublicKey(publicKey);
        accountSignature.setSignature(CryptoUtil.signEd25519(privateKey, "0x00"));
        singleEd25519Signature = accountSignature;
        return singleEd25519Signature;
    }
}
