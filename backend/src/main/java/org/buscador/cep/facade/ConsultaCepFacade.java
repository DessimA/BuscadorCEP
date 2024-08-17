package org.buscador.cep.facade;

import org.buscador.cep.config.ConfigurationProvider;
import org.buscador.cep.model.EnderecoResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsultaCepFacade {
    private static final String API_URL = ConfigurationProvider.getProperty("API_URL");

    public EnderecoResponse consultarCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + cep + "/json/";
        return restTemplate.getForObject(url, EnderecoResponse.class);
    }
}