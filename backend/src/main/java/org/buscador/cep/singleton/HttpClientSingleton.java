package org.buscador.cep.singleton;

import java.net.http.HttpClient;
import java.time.Duration;

public class HttpClientSingleton {
    private static final HttpClient INSTANCE = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    private HttpClientSingleton() {}

    public static HttpClient getInstance() {
        return INSTANCE;
    }
}