package com.hotel.dreams.dreams.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.repositories.RepositorioUsuario;

@Service
public class ServicioImplUsuario implements UserDetailsService {

    @Autowired
    protected RepositorioUsuario _RepositorioUsuario;

    @Autowired
    PasswordEncoder _PasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = _RepositorioUsuario.findByNumeroCelular(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario no existe"));

        // ! no usamos roles
        // List<SimpleGrantedAuthority> roles = new ArrayList<>();

        return new User(usuario.getNumeroCelular(), usuario.getClave(), new ArrayList<>());

    }

    // metodo para cerar una cuenta de usuario

    public void registrarUsuario(Usuario usuario) throws Exception {
        try {
            usuario.setClave(_PasswordEncoder.encode(usuario.getClave()));
            _RepositorioUsuario.save(usuario);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
