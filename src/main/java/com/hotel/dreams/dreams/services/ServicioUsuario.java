package com.hotel.dreams.dreams.services;

import com.hotel.dreams.dreams.models.Huesped;

public interface ServicioUsuario extends ServicioBase<Huesped, Integer>{
    //metodo para guardar de manera encriptada la informacion sensible del usuario
    //usaremos argon2 u otro algoritmo
    public Huesped registrarUsuario(Huesped usuario);
}
