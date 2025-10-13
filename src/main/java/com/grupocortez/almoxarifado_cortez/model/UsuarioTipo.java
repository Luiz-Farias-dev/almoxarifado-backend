package com.grupocortez.almoxarifado_cortez.model;

public enum UsuarioTipo {
    ADMIN("admin"),
    ALMOXARIFE("almoxarife"),
    EXTERNO("externo"),
    INTERNO("interno");

    private String tipo;

    UsuarioTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
}
