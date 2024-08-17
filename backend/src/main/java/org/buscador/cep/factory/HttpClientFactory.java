package org.buscador.cep.factory;

import java.net.http.HttpClient;

public class HttpClientFactory {
    public static HttpClient getHttpClient() {
        return HttpClient.newHttpClient();
    }
}