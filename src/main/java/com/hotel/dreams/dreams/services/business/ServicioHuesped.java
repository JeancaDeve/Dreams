package com.hotel.dreams.dreams.services.business;

import com.hotel.dreams.dreams.models.Huesped;

public interface ServicioHuesped extends ServicioBase<Huesped, Integer> {
   public void hacerReserva(Huesped huesped) throws Exception;

   public Huesped buscarPorDni(String numeroDni) throws Exception;
}
