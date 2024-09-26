package com.locadora.model;

import com.locadora.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    @ManyToOne
    private Automovel automovel;

    @ManyToOne
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @OneToOne
    private  AvaliacaoPedido avaliacaoPedido;
    public Pedido(LocalDate dataPedido, Automovel automovel, Cliente cliente) {
    }
}
