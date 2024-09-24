package com.locadora.repository;

import com.locadora.model.Cliente;
import com.locadora.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
