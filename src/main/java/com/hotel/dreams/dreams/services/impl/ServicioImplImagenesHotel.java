package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Imagenes;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioImagesHotel;
import com.hotel.dreams.dreams.services.ServicioImagenesHotel;

@Service
public class ServicioImplImagenesHotel extends ServicioBaseImpl<Imagenes, Integer>
        implements ServicioImagenesHotel {

    @Autowired
    RepositorioImagesHotel repositorioBase;

    public ServicioImplImagenesHotel(RepositorioBase<Imagenes, Integer> repositorioBase) {
        super(repositorioBase);
    }

}
