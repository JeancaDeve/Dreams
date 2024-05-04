package com.hotel.dreams.dreams.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.services.impl.ServicioImplUsuario;

import jakarta.annotation.security.PermitAll;

@RestController
@RequestMapping("api/v1/dreams/usuario")
@CrossOrigin(origins = "*")

public class ControladorUsuario extends ControladorBaseImp<Usuario, ServicioImplUsuario> {
  @Autowired
  protected ServicioImplUsuario servicioUsuario;

  @PostMapping("/registrar")
  @PermitAll
  public ResponseEntity<?> RegistarUsuario(@RequestBody Usuario usuario) {
    try {
      return ResponseEntity.ok(servicioUsuario.registrarUsuario(usuario));
    } catch (Exception e) {
      throw new RuntimeException("Este es el error: " + e.getMessage());
    }
  }

}
