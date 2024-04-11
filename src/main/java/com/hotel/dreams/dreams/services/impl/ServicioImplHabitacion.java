package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioHabitacion;
import com.hotel.dreams.dreams.services.ServicioHabitacion;

@Service
public class ServicioImplHabitacion extends ServicioBaseImpl<Habitacion,Integer> implements ServicioHabitacion{

@Autowired
RepositorioHabitacion repositorioBase;

    public ServicioImplHabitacion(RepositorioBase<Habitacion, Integer> repositorioBase) {
        super(repositorioBase);
    }

}
