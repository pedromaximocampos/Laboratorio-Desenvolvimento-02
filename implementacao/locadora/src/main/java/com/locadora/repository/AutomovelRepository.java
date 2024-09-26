package com.locadora.repository;

import com.locadora.model.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovelRepository extends JpaRepository<Automovel,Long> {
}
