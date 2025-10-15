package com.grupocortez.almoxarifado_cortez.service;

import com.grupocortez.almoxarifado_cortez.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService implements UserDetailsService {

    UsuarioRepository repository;

    AuthorizationService(UsuarioRepository repository) {
        this.repository = repository;
    }

    AuthorizationService() {}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByCpf(username);
    }
}
