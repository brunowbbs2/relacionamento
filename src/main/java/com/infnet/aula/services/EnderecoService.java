package com.infnet.aula.services;

import org.springframework.stereotype.Service;

import com.infnet.aula.entities.Cliente;
import com.infnet.aula.entities.Endereco;
import com.infnet.aula.repositories.ClienteRepository;
import com.infnet.aula.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;
    private final ClienteRepository clienteRepository;

    public EnderecoService(EnderecoRepository enderecoRepository, ClienteRepository clienteRepository) {
        this.repository = enderecoRepository;
        this.clienteRepository = clienteRepository;
    }

    public Endereco salvar(Endereco endereco, long idCliente) {

        // BUSCANDO SE O CLIENTE
        Cliente cliente = this.clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));

        // SALVANDO O ENDERECO PARA PEGAR O ID
        Endereco enderecoSalvo = this.repository.save(endereco);

        cliente.endereco = enderecoSalvo;

        this.clienteRepository.save(cliente);

        return enderecoSalvo;

    }

}
