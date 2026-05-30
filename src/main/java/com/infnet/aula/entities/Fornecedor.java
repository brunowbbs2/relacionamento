package com.infnet.aula.entities;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="fornecedores")
public class Fornecedor {

    @Id
    private String id;

    private String nome;
}
