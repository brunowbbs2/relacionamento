package com.infnet.aula.services;

import com.infnet.aula.entities.Fornecedor;
import com.infnet.aula.repositories.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForncedorService {

    private final FornecedorRepository repository;

    public ForncedorService(FornecedorRepository fornecedorRepository){
        this.repository = fornecedorRepository;
    }

    public Fornecedor salvar(Fornecedor fornecedor){
        return this.repository.save(fornecedor);
    }

    public List<Fornecedor> buscarTodos(){
        return this.repository.findAll();
    }
}
