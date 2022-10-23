package com.orcas.client;

import com.dtflys.forest.Forest;
import com.orcas.autoconfigure.AptosProperties;
import com.orcas.model.transaction.EncodeSubmissionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Component
public class TransactionClient {
    @Autowired
    private AptosProperties aptosProperties;

    private static final String URL = "transactions/";

    private String getUrl() {
        return aptosProperties.getUrl() + URL;
    }

    public String encodeSubmission(EncodeSubmissionRequest request) {
        return Forest.post(getUrl() + "encode_submission").addBody(request).executeAsString();
    }


}
