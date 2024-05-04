package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.services.impl.ServicioImplHuesped;

@RestController
@RequestMapping("api/v1/dreams/huesped")
@CrossOrigin(origins = "*")
public class ControladorHuesped extends ControladorBaseImp<Huesped, ServicioImplHuesped> {
    @Autowired
    protected ServicioImplHuesped servicioHuesped;

    @PostMapping("/reservar/{idHabitacion}")
    public ResponseEntity<?> hacerReserva(@RequestBody Huesped huesped, @PathVariable int idHabitacion) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicioHuesped.hacerReserva(huesped, idHabitacion));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
