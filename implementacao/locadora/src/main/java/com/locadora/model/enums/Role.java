package com.locadora.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {

    CLIENTE("cliente"),
    AGENTE("agente");

    private String tipo;
}
