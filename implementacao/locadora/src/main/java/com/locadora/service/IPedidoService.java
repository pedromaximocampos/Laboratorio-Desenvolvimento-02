package com.locadora.service;

import com.locadora.enums.StatusPedido;
import com.locadora.model.Automovel;
import com.locadora.model.Pedido;

public interface IPedidoService {
    public Pedido introduzirPedido(Long id_Cliente, Long id_Automovel);
    public Pedido modificarPedido(Long id_Pedido, Automovel automovel);
    public Pedido consultaPedido(Long id_Pedido);
    public void cancelarPeido(Long id_Pedido);
    public Pedido avaliarPedido(Long id_Pedido, StatusPedido status,String avaliacao);
}
