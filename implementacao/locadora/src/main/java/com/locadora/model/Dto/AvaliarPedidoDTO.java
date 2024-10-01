package com.locadora.model.Dto;

import com.locadora.model.enums.StatusPedido;
import lombok.Getter;

@Getter
public class AvaliarPedidoDTO {
    private StatusPedido status;
    private String avaliacao;
}
