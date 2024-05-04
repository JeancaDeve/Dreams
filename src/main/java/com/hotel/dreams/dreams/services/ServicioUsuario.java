package com.hotel.dreams.dreams.services;

import com.hotel.dreams.dreams.models.Usuario;

public interface ServicioUsuario extends ServicioBase<Usuario, Integer>{

    public Usuario registrarUsuario(Usuario usuario);
}
