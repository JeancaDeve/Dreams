package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.entities.Habitacion;

@Repository
public interface RepositorioHabitacion extends RepositorioBase<Habitacion, Integer>{
  //todo: se pueden agregar mas metodos personalizados para la clase
}