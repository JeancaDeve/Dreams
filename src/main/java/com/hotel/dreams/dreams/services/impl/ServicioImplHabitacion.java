package com.hotel.dreams.dreams.services.impl;

import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.services.ServicioHabitacion;

@Service
public class ServicioImplHabitacion extends ServicioBaseImpl<Habitacion,Integer> implements ServicioHabitacion{

    public ServicioImplHabitacion(RepositorioBase<Habitacion, Integer> repositorioBase) {
        super(repositorioBase);
    }

}
