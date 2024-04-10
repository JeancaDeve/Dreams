package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Usuario extends EntidadBase {

    // ! Solo especificamos el nombre de la columna cuando usamos 'camelCase'

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(length = 100, nullable = false)
    private String apellido;

    @Column(nullable = false, length = 9, columnDefinition = "char(9)", name = "numero_celular") // un numero celular
                                                                                                 // maximo es de 9
                                                                                                 // digitos
    private String numeroCelular;

    @Column(nullable = false, length = 8, columnDefinition = "char(8)") // un dni maximo es de 8 digitos
    private String dni;
    @Column(columnDefinition = "datetime", name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(length = 255)
    private String clave;
}
