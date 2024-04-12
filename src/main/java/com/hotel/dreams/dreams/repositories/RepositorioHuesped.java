package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Huesped;

@Repository
public interface RepositorioHuesped extends RepositorioBase<Huesped, Integer> {
    //public void cambiarEstadoHabitacion(boolean isReservado, Integer idHabitacion);
}
