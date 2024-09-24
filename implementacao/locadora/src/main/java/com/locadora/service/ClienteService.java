package com.locadora.service;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private ProfissaoService profissaoService;

    @Autowired
    private UsuarioService usuarioService;

    @Transactional
    public Cliente create(Cliente clienteRequest) {
        clienteRequest.setEndereco(enderecoService.create(clienteRequest.getEndereco()));
        clienteRequest.setProfissao(profissaoService.create(clienteRequest.getProfissao()));
        clienteRequest.setUsuario(usuarioService.create(clienteRequest.getUsuario()));

        return clienteRepository.save(clienteRequest);
    }
}
