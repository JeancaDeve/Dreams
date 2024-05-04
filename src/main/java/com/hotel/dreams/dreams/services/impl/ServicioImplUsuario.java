package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioUsuario;
import com.hotel.dreams.dreams.services.ServicioUsuario;

@Service
public class ServicioImplUsuario extends ServicioBaseImpl<Usuario, Integer> implements ServicioUsuario {

    @Autowired
    protected RepositorioUsuario _RepositorioUsuario;
    private PasswordEncoder _PasswordEncoder;

    public ServicioImplUsuario(RepositorioBase<Usuario, Integer> repositorioBase, PasswordEncoder passwordEncoder) {
        super(repositorioBase);
        _PasswordEncoder = passwordEncoder;
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        try {
            usuario.setClave(_PasswordEncoder.encode(usuario.getClave()));
            return _RepositorioUsuario.save(usuario);
        } catch (Exception e) {
            throw new RuntimeException("Este es el error"+ e.getMessage());
        }
    }

}
