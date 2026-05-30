package com.infnet.aula.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.infnet.aula.entities.Cliente;
import com.infnet.aula.repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return this.repository.save(cliente);
    }

    public Page<Cliente> buscarTodos(Pageable pageable){
        return this.repository.findAll(pageable);
    }


    public Cliente buscarPorId(Long idCliente) {
        Cliente cliente = this.repository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return cliente;
    }

}
