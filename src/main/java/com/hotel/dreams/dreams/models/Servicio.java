package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Servicio extends EntidadBase {
    @Column(length = 500)
    private String icono; // sera el icono del servicio, ejemplo una pesa
    @Column(length = 30)
    private String nombre;
}
