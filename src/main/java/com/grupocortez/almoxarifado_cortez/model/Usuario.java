package com.grupocortez.almoxarifado_cortez.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario_tb")
@Setter
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String tipo;

    public Usuario(String cpf, String senha, String tipo){
        this.cpf = cpf;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Usuario() {}

}
