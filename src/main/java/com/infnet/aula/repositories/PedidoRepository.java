package com.infnet.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.aula.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}
