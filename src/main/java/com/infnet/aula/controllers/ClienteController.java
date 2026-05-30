package com.infnet.aula.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnet.aula.entities.Cliente;
import com.infnet.aula.services.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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

    @GetMapping
    public Page<Cliente> buscarTodos(Pageable pageable){
        return this.service.buscarTodos(pageable);
    }

    @GetMapping("/{idCliente}")
    public Cliente buscarPorId(@PathVariable Long idCliente) {
        return this.service.buscarPorId(idCliente);
    }

}
