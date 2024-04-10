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
public class Habitacion extends EntidadBase {
    @Column(columnDefinition = "tinyint")
    private int numero; // numero de habitacion

    @Column(length = 500)
    private String descripcion; // especificamos que con que cuenta la habitacion

    @Column(columnDefinition = "char(1)")
    private String estado = "1"; // 1 = disponible, 0 = ocupado
    @Column(length = 500)
    private String imagen;

}