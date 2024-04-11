package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Imagenes;

@Repository
public interface RepositorioImagesHotel extends RepositorioBase<Imagenes, Integer> {
    // todo: se pueden agregar mas metodos personalizados para la clase
}
