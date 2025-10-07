package com.grupocortez.almoxarifado_cortez.service;

import com.grupocortez.almoxarifado_cortez.model.Usuario;
import com.grupocortez.almoxarifado_cortez.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public  UsuarioService(UsuarioRepository usuario) {
        this.usuarioRepo = usuario;
    }

    public void criarUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    public void deletarUsuario(Integer id){
        usuarioRepo.deleteById(id);
    }
}
