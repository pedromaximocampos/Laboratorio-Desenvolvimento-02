package com.locadora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String RG;

    private String CPF;

    @OneToOne
    private Profissao profissao;

    @OneToOne
    private Endereco endereco;

    @OneToOne
    private Usuario usuario;

    private List<Double> rendimentosAuferidos;

    public void updateData(Cliente cliente) {
        this.nome = cliente.getNome() != null ? cliente.getNome() : this.nome;
        this.RG = cliente.getRG() != null ? cliente.getRG() : this.RG;
        this.CPF = cliente.getCPF() != null ? cliente.getCPF() : this.CPF;
        this.endereco.updateData(cliente.getEndereco());
        this.profissao.updateData(cliente.getProfissao());
        this.usuario.updateData(cliente.getUsuario());
        this.rendimentosAuferidos = cliente.getRendimentosAuferidos() != null ? cliente.getRendimentosAuferidos() : this.rendimentosAuferidos;
    }
}
