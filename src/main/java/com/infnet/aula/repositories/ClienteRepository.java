package com.infnet.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.aula.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
