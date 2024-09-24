package com.locadora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CEP;

    private int numero;

    private String complemento;

    public void updateData(Endereco endereco) {
        this.CEP = endereco.getCEP() != null ? endereco.getCEP() : this.CEP;
        this.numero = endereco.getNumero() != 0 ? endereco.getNumero() : this.numero;
        this.complemento = endereco.getComplemento() != null ? endereco.getComplemento() : this.complemento;
    }
}
