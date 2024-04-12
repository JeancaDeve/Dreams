package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Esta clase representa a la entidad Usuario, lo cual tendra credenciales
 * Que le permitira ingresa a la aplicacion
 * 
 * @param clave         : Clave de acceso a la aplicacion
 * @param numeroCelular : Numero de celular del usuario
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Usuario extends EntidadBase {
  @Column(length = 100, nullable = false)
  private String nombres;

  @Column(length = 100, nullable = false)
  private String apellidos;

  @Column(nullable = false, length = 9, columnDefinition = "char(9)", name = "numero_celular")
  private String numeroCelular; // un numero celular maximo es de 9 digitos

  @Column(columnDefinition = "char(8)")
  private String dni; // un dni tiene 8 digitos (77493128)

  @Column(columnDefinition = "datetime", name = "fecha_nacimiento")
  private String fechaNacimiento;

  @Column(length = 255)
  private String clave;
}
