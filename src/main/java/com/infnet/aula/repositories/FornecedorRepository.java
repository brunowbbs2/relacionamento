package com.infnet.aula.repositories;

import com.infnet.aula.entities.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
}
