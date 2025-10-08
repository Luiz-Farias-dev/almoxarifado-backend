package com.grupocortez.almoxarifado_cortez.controller;

import com.grupocortez.almoxarifado_cortez.model.Usuario;
import com.grupocortez.almoxarifado_cortez.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/almoxarifado-cortez")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    //Continuar o postmapping de usuarios, pesquisar o que é ResponseEntity<> porque ela é importante e como deveria usu-la para ser o return da função de post
    @PostMapping("/usuario")
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        usuarioService.criarUsuario(usuario);
    }
}
