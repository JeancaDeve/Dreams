package com.hotel.dreams.dreams.services;

import com.hotel.dreams.dreams.models.Usuario;

public interface ServicioUsuario extends ServicioBase<Usuario, Integer>{
    //metodo para guardar de manera encriptada la informacion sensible del usuario
    //usaremos argon2 u otro algoritmo
    public Usuario registrarUsuario(Usuario usuario);
}
