package com.grupocortez.almoxarifado_cortez.repository;

import com.grupocortez.almoxarifado_cortez.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    UserDetails findByCpf(String cpf);
}
