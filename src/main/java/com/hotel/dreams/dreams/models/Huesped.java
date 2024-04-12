package com.hotel.dreams.dreams.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * Esta es la entidad de Huesped
 * 
 * *Tiene una relacion con reserva de uno a muchos @oneToMany
 * 
 * 
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Huesped extends EntidadBase {

    // ! Solo especificamos el nombre de la columna cuando usamos 'camelCase'

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;

}
