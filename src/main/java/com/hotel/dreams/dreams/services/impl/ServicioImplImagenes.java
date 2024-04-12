package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Imagenes;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioImagenes;
import com.hotel.dreams.dreams.services.ServicioImagenes;

@Service
public class ServicioImplImagenes extends ServicioBaseImpl<Imagenes, Integer>
        implements ServicioImagenes {

    @Autowired
    RepositorioImagenes repositorioBase;

    public ServicioImplImagenes(RepositorioBase<Imagenes, Integer> repositorioBase) {
        super(repositorioBase);
    }

}
