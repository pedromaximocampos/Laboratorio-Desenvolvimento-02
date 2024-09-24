package com.locadora.service;

import com.locadora.model.Profissao;
import com.locadora.repository.ProfissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfissaoService {

    @Autowired
    private ProfissaoRepository profissaoRepository;

    public Profissao create(Profissao profissao) {
        return profissaoRepository.save(profissao);
    }
}
