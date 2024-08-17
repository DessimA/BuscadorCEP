package org.buscador.cep.controller;

import org.buscador.cep.facade.ConsultaCepFacade;
import org.buscador.cep.model.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ConsultaCepController {

    @Autowired
    private ConsultaCepFacade consultaCepFacade;

    @GetMapping("/consultar")
    public EnderecoResponse consultarCep(@RequestParam String cep) {
        try {
            return consultaCepFacade.consultarCep(cep);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro ao consultar CEP: " + e.getMessage());
        }
    }
}