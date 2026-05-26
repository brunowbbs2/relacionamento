package com.infnet.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.aula.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}