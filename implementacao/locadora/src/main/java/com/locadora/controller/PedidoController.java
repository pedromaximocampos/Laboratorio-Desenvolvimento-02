package com.locadora.controller;

import com.locadora.model.Automovel;
import com.locadora.model.Dto.AvaliarPedidoDTO;
import com.locadora.model.Dto.InserirPedidoDTO;
import com.locadora.model.Pedido;
import com.locadora.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> introduzirPedido(@RequestBody InserirPedidoDTO objDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.introduzirPedido(objDTO.id_Cliente, objDTO.id_Automovel));
    }

    @GetMapping("/consultar/{id}")
    public ResponseEntity<Pedido> consultarPedido(@PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.consultaPedido(id));
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<Pedido> modificarPedido(@RequestBody Automovel automovel, @PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.modificarPedido(id, automovel));
    }

    @PutMapping("/cancelar/{id}")
    public ResponseEntity<Void> cancelarPedido(@PathVariable Long id) {
        pedidoService.cancelarPeido(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/avaliar/{id}")
    public ResponseEntity<Pedido> avaliarPedido(@RequestBody AvaliarPedidoDTO avaliarPedidoDTO, @PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.avaliarPedido(id,avaliarPedidoDTO.status,avaliarPedidoDTO.avaliacao));
    }

}
