package com.infnet.aula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnet.aula.entities.Cliente;
import com.infnet.aula.services.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {

        return this.service.salvar(cliente);

    }

    @GetMapping("/{idCliente}")
    public Cliente buscarPorId(@PathVariable Long idCliente) {
        return this.service.buscarPorId(idCliente);
    }

}
