package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.entities.Servicio;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioServicio;
import com.hotel.dreams.dreams.services.ServicioServicio;

@Service
public class ServicioImplServicio extends ServicioBaseImpl<Servicio, Integer> implements ServicioServicio {

    @Autowired
    RepositorioServicio repositorioServicio;

    public ServicioImplServicio(RepositorioBase<Servicio, Integer> repositorioBase) {
        super(repositorioBase);
    }


}
