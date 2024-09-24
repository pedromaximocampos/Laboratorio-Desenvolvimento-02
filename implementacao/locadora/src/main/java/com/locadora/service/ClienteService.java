package com.locadora.service;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado. Id " + id));
    }

    @Transactional
    public Cliente update(Cliente cliente, Long id) {
        var savedClient = findById(id);
        savedClient.updateData(cliente);
        return clienteRepository.save(savedClient);
    }

    @Transactional
    public void delete(Long id) {
        findById(id);
        clienteRepository.deleteById(id);
    }
}
