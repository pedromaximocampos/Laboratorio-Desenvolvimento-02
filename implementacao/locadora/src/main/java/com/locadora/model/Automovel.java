package com.locadora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_AUTOMOVEL")
public class Automovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula;

    private String ano;

    private String marca;

    private String modelo;

    private String placa;

    private String proprietario;

    private boolean disponivel;

    public void alterarDisponibildade() {
        this.disponivel = !this.disponivel;
    }

    public boolean verificarDisponibilidade() {
        return this.disponivel;
    }

    public Automovel vincularProprietario(String proprietario) {
        this.proprietario = proprietario;
        return this;
    }
}
