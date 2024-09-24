package com.locadora.model;

import com.locadora.model.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;

    public void updateData(Usuario usuario) {
        this.login = usuario.getLogin() != null ? usuario.getLogin() : this.login;
        this.senha = usuario.getSenha() != null ? usuario.getSenha() : this.senha;
        this.role = usuario.getRole() != null ? usuario.getRole() : this.role;
    }
}
