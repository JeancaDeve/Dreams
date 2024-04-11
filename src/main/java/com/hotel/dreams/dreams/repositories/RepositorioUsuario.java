package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Huesped;

@Repository
public interface RepositorioUsuario extends RepositorioBase<Huesped, Integer>{
    //todo: se pueden agregar mas metodos personalizados para la clase
}
