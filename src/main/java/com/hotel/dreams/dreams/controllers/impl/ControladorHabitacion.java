package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.services.impl.ServicioImplHabitacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("api/v1/dreams/habitacion")
@CrossOrigin(origins = "*")
public class ControladorHabitacion extends ControladorBaseImp<Habitacion, ServicioImplHabitacion> {

  @Autowired
  ServicioImplHabitacion _servicioImplHabitacion;

  @GetMapping("/disponibles")
  public ResponseEntity<List<Habitacion>> findHabitacionesDisponibles() {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(_servicioImplHabitacion.getHabitacionesDisponibles());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
  }

}
