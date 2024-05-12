package com.hotel.dreams.dreams.controllers.implementation;
/* 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.services.impl.ServicioImplUsuario;

@RestController
@RequestMapping("auth")
@CrossOrigin(origins = "*")
//@PreAuthorize("permitAll()")
public class ControladorAutenticacion {

  @Autowired
  protected ServicioImplUsuario servicioImplUsuario;

  @PostMapping("/crearcuenta")
  public ResponseEntity<?> crearcuenta(@RequestBody Usuario usuario) throws Exception {
    try {
      servicioImplUsuario.registrarUsuario(usuario);
      return ResponseEntity.status(HttpStatus.OK).body("Se ha creado la cuenta");
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }
  }

} */
