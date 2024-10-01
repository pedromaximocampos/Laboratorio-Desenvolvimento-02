package com.locadora.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
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

    @ElementCollection
    @CollectionTable(name = "TB_RENDIMENTOS_AUFERIDOS")
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
