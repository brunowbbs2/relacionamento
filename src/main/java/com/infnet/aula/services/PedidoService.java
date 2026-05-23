package com.infnet.aula.services;


import org.springframework.stereotype.Service;

import com.infnet.aula.entities.Pedido;
import com.infnet.aula.repositories.ClienteRepository;
import com.infnet.aula.repositories.PedidoRepository;

@Service
public class PedidoService {

    private final PedidoRepository repository;
    private final ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository repository, ClienteRepository clienteRepository){
        this.repository = repository;
        this.clienteRepository = clienteRepository;
    }


    public Pedido salvar(Pedido pedido, Long idCliente){
        pedido.cliente = this.clienteRepository.findById(idCliente).orElseThrow(()-> new RuntimeException("Cliente nao foi encontrado!"));

        return this.repository.save(pedido);

    }
    
}
