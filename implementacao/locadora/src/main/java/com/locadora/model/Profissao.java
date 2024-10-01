package com.locadora.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PROFISSAO")
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    private String cargo;

    private String empresa;

    private Double salario;

    public void updateData(Profissao profissao) {
        this.cargo = profissao.getCargo() != null ? profissao.getCargo() : this.cargo;
        this.empresa = profissao.getEmpresa() != null ? profissao.getEmpresa() : this.empresa;
        this.salario = profissao.getSalario() != null ? profissao.getSalario() : this.salario;
    }
}
