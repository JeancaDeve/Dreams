package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.entities.Habitacion;
import com.hotel.dreams.dreams.services.impl.ServicioImplHabitacion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/v1/dreams/habitacion")
@CrossOrigin (origins = "*")
public class ControladorHabitacion extends ControladorBaseImp<Habitacion, ServicioImplHabitacion>{

}
