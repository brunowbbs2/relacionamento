package com.infnet.aula.services;

import org.springframework.stereotype.Service;

import com.infnet.aula.entities.Cliente;
import com.infnet.aula.repositories.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return this.repository.save(cliente);
    }

    public Cliente buscarPorId(Long idCliente) {
        Cliente cliente = this.repository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return cliente;
    }

}
