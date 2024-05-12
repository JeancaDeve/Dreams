package com.hotel.dreams.dreams.services.business;

import java.util.List;

import com.hotel.dreams.dreams.models.Habitacion;

public interface ServicioHabitacion extends ServicioBase<Habitacion, Integer> {

  public List<Habitacion> getHabitacionesDisponibles() throws Exception;

  public int cambiarEstadoHabitacion(int codigo) throws Exception;

}
