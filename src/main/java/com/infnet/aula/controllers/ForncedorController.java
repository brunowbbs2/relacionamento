package com.infnet.aula.controllers;

import com.infnet.aula.entities.Fornecedor;
import com.infnet.aula.services.ForncedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores")
public class ForncedorController {

    private final ForncedorService service;

    public ForncedorController(ForncedorService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Fornecedor> salvar(@RequestBody Fornecedor fornecedor){
        Fornecedor fornecedorSalvo = this.service.salvar(fornecedor);

        return new ResponseEntity<>(fornecedorSalvo, HttpStatus.CREATED);
    }

}
