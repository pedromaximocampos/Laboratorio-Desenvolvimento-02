package com.locadora.model;

import com.locadora.model.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
        this.date = dataPedido;
        this.automovel = automovel;
        this.cliente = cliente;
        this.status = StatusPedido.PENDENTE;
    }
}
