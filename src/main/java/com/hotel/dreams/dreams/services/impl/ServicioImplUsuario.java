package com.hotel.dreams.dreams.services.impl;

import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.services.ServicioUsuario;

@Service
public class ServicioImplUsuario extends ServicioBaseImpl<Usuario, Integer> implements ServicioUsuario {

    public ServicioImplUsuario(RepositorioBase<Usuario, Integer> repositorioBase) {
        super(repositorioBase);

    }

    // todo: completar el metodo, aun falta darle funcionamiento
    @Override
    public Usuario registrarUsuario(Huesped usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'registrarUsuario'");
    }

}
