package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Imagenes;
import com.hotel.dreams.dreams.services.impl.ServicioImplImagenes;

@RestController
@RequestMapping("api/v1/dreams/imagen")
@CrossOrigin(origins = "*")
public class ControladorImagenes extends ControladorBaseImp<Imagenes, ServicioImplImagenes> {

}
