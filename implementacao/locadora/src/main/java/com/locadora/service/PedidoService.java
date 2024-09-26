package com.locadora.service;

import com.locadora.enums.StatusPedido;
import com.locadora.model.Automovel;
import com.locadora.model.AvaliacaoPedido;
import com.locadora.model.Cliente;
import com.locadora.model.Pedido;
import com.locadora.repository.AutomovelRepository;
import com.locadora.repository.AvaliacaoPedidoRepository;
import com.locadora.repository.ClienteRepository;
import com.locadora.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PedidoService implements IPedidoService{

    PedidoRepository _pedidoRepository;
    AutomovelRepository _automovelRepository;
    ClienteRepository _clienteRepository;
    AvaliacaoPedidoRepository _avaliacaoPedidoRepository;


    public PedidoService(AutomovelRepository automovelRepository, ClienteRepository clienteRepository, PedidoRepository pedidoRepository, AvaliacaoPedidoRepository avaliacaoPedidoRepository) {
        _automovelRepository = automovelRepository;
        _clienteRepository = clienteRepository;
        _pedidoRepository = pedidoRepository;
        _avaliacaoPedidoRepository = avaliacaoPedidoRepository;
    }

    @Override
    public Pedido introduzirPedido(Long id_Cliente, Long id_Automovel) {
        Automovel automovel = _automovelRepository.findById(id_Automovel).get();
        Cliente cliente = _clienteRepository.findById(id_Cliente).get();
        LocalDate dataPedido = LocalDate.now();
        Pedido pedido = new Pedido(dataPedido,automovel,cliente);
        return pedido;
    }

    @Override
    public Pedido modificarPedido(Long id_Pedido, Automovel automovel) {
        Pedido pedido = _pedidoRepository.findById(id_Pedido).get();
        pedido.setAutomovel(automovel);
        _pedidoRepository.save(pedido);
        return pedido;
    }

    @Override
    public Pedido consultaPedido(Long id_Pedido) {
        Pedido pedido = _pedidoRepository.findById(id_Pedido).get();
        return pedido;
    }

    @Override
    public void cancelarPeido(Long id_Pedido) {
        Pedido pedido = _pedidoRepository.findById(id_Pedido).get();
        pedido.setStatus(StatusPedido.CANCELADO);
    }

    @Override
    public Pedido avaliarPedido(Long id_Pedido, StatusPedido status, String avaliacao) {
        AvaliacaoPedido avaliacaoPedido = new AvaliacaoPedido(avaliacao);
        _avaliacaoPedidoRepository.save(avaliacaoPedido);
        Pedido pedido = _pedidoRepository.findById(id_Pedido).get();
        pedido.setAvaliacaoPedido(avaliacaoPedido);
        pedido.setStatus(status);
        _pedidoRepository.save(pedido);
        return pedido;
    }
}
