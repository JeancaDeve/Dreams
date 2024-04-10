package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.entities.Servicio;
import com.hotel.dreams.dreams.services.impl.ServicioImplServicio;

@RestController
@RequestMapping("api/v1/dreams/servicio")
@CrossOrigin (origins = "*")
public class ControladorServicio extends ControladorBaseImp<Servicio, ServicioImplServicio>{

}
