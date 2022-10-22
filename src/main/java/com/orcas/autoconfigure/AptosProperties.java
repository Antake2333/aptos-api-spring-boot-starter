package com.orcas.autoconfigure;

import com.dtflys.forest.utils.StringUtils;
import com.orcas.constant.AptosApiConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@ConfigurationProperties(prefix = AptosApiConstant.APTOS)
public class AptosProperties {
    private String url = AptosApiConstant.MAIN_NET_URL;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (StringUtils.isBlank(url)) {
            this.url = AptosApiConstant.MAIN_NET_URL;
        } else {
            this.url = url.lastIndexOf("/") == url.length() - 1 ? url : url + "/";
        }
    }
}
