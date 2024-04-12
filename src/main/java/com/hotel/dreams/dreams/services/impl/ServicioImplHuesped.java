package com.hotel.dreams.dreams.services.impl;

import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.services.ServicioHuesped;

@Service
public class ServicioImplHuesped extends ServicioBaseImpl<Huesped, Integer> implements ServicioHuesped {

    /*
     * @Autowired
     * protected RepositorioHuesped _RepositorioHuesped;
     */

    public ServicioImplHuesped(RepositorioBase<Huesped, Integer> repositorioBase) {
        super(repositorioBase);
    }

    /*
     * @Override
     * public void cambiarEstadoHabitacion(boolean isReserva, int idHabitacion) {
     * _RepositorioHuesped.cambiarEstadoHabitacion(isReserva, idHabitacion);
     * }
     */
}
