package com.locadora.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_Avaliacao")
public class AvaliacaoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public AvaliacaoPedido(String avaliacao) {
    }
}
