package com.infnet.aula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnet.aula.entities.Endereco;
import com.infnet.aula.services.EnderecoService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/endereco/{idCliente}")
public class EnderecoController {

    private final EnderecoService service;

    public EnderecoController(EnderecoService enderecoService) {
        this.service = enderecoService;
    }

    @PostMapping
    public Endereco salvar(@RequestBody Endereco entity, @PathVariable Long idCliente) {
        return this.service.salvar(entity, idCliente);
    }

}
