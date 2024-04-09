package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servicio extends EntidadBase {
    @Column(length = 500)
    private String icono; // sera el icono del servicio, ejemplo una pesa
    @Column(length = 30)
    private String nombre;
}
