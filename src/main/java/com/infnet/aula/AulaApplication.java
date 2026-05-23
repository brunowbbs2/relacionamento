package com.infnet.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

}

// OneToMany

// // CLIENTE
// ID: 1
// NOME: WESLEY 


// // PEDIDO
// ID: 1
// // PRODUTOS
// ENDERECO:
// ID_CLIENTE:1

// ID: 2
// // PRODUTOS
// ENDERECO:
// ID_CLIENTE:1


// ID: 3
// // PRODUTOS
// ENDERECO:
// ID_CLIENTE:1