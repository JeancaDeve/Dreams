package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Esta clase representa a la entidad Usuario, lo cual tendra credenciales
 * Que le permitira ingresa a la aplicacion
 * 
 * @param clave         : Clave de acceso a la aplicacion
 * @param numeroCelular : Numero de celular del usuario
 * @param nombreCompleto: Nombre del usuario
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Usuario extends EntidadBase {
  @Column(length = 250, nullable = false)
  private String nombreCompleto;

  @Column(nullable = false, length = 9, columnDefinition = "char(9)", name = "numero_celular", unique = true)
  private String numeroCelular; // un numero celular maximo es de 9 digitos

  @Column(length = 500)
  private String clave;
}
