package com.orcas.interceptor;

import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.http.ForestResponse;
import com.dtflys.forest.interceptor.Interceptor;
import org.springframework.stereotype.Component;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Component
public class ErrorInterceptor<T> implements Interceptor<T> {
    @Override
    public void onSuccess(T data, ForestRequest request, ForestResponse response) {
        Interceptor.super.onSuccess(data, request, response);
    }
}
