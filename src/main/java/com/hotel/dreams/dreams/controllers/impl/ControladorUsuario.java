package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.services.impl.ServicioImplUsuario;

@RestController
@RequestMapping("api/v1/dreams/usuario")
@CrossOrigin (origins = "*")

public class ControladorUsuario extends ControladorBaseImp<Huesped, ServicioImplUsuario>{

}
