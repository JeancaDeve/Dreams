package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioUsuario;
import com.hotel.dreams.dreams.services.ServicioUsuario;

@Service
public class ServicioImplUsuario extends ServicioBaseImpl<Usuario, Integer> implements ServicioUsuario {

    @Autowired
    RepositorioUsuario repositorioBase;

    public ServicioImplUsuario(RepositorioBase<Usuario, Integer> repositorioBase) {
        super(repositorioBase);

    }


    //todo: completar el metodo, aun falta darle funcionamiento
    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'registrarUsuario'");
    }

}
