package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.entities.Usuario;

@Repository
public interface RepositorioUsuario extends RepositorioBase<Usuario, Integer>{
    //todo: se pueden agregar mas metodos personalizados para la clase
}
