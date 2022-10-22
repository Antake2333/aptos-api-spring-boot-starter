package com.orcas.client;

import com.orcas.autoconfigure.AptosProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Component
public class AptosClient {
    @Autowired
    private AptosProperties aptosProperties;
}
