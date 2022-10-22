package com.orcas.client;

import com.dtflys.forest.Forest;
import com.orcas.autoconfigure.AptosProperties;
import com.orcas.model.account.AccountData;
import com.orcas.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Component
public class AccountClient {
    @Autowired
    private AptosProperties aptosProperties;

    private static final String ACCOUNT_URL = "accounts/";

    private String getAccountUrl() {
        return aptosProperties.getUrl() + ACCOUNT_URL;
    }

    public AccountData getAccount(String address) {
        Assert.isAddress(address);
        return Forest.get(getAccountUrl() + address).execute(AccountData.class);
    }
}
