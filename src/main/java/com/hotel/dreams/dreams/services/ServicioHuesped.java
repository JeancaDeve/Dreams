package com.hotel.dreams.dreams.services;

import com.hotel.dreams.dreams.models.Huesped;

public interface ServicioHuesped extends ServicioBase<Huesped, Integer> {
   public String hacerReserva(Huesped huesped, int idHabitacion) throws Exception;
}
