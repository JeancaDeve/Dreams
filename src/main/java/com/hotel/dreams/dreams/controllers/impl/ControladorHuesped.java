package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.services.impl.ServicioImplHuesped;

@RestController
@RequestMapping("api/v1/dreams/huesped")
@CrossOrigin(origins = "*")
public class ControladorHuesped extends ControladorBaseImp<Huesped, ServicioImplHuesped>{
    
}
