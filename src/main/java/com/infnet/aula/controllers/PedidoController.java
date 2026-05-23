package com.infnet.aula.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnet.aula.entities.Pedido;
import com.infnet.aula.services.PedidoService;

@RestController
@RequestMapping("/pedidos/{idCliente}")
public class PedidoController {
    

    private final PedidoService service;

    public PedidoController(PedidoService service){
        this.service = service;
    }

    @PostMapping
    public Pedido save(@RequestBody Pedido cliente, @PathVariable Long idCliente) {

        return this.service.salvar(cliente, idCliente);

    }


}
