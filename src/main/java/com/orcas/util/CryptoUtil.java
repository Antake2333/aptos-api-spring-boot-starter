package com.orcas.util;

import com.orcas.exception.AptosApi4jException;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

public class CryptoUtil {
    // 用ED25519算法实现签名验签
    public static String signEd25519(String privateKey, String message) {
        Assert.isNotBlank(privateKey, "privateKey");
        Assert.isNotBlank(message, "message");
        try {
            // 用ED25519算法实现签名验签
            EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
            EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(privateKey.getBytes(StandardCharsets.UTF_8), spec);
            Signature signature = new EdDSAEngine(MessageDigest.getInstance(spec.getHashAlgorithm()));
            PrivateKey sKey = new EdDSAPrivateKey(privateKeySpec);
            signature.initSign(sKey);
            signature.update(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception e) {
            throw new AptosApi4jException("signEd25519 error");
        }
    }
}
