package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Factura extends EntidadBase {

    @Column(columnDefinition = "char(11)")
    private String ruc;
    @Column(columnDefinition = "float")
    private double monto;
    @Column(columnDefinition = "datetime")
    private double fecha;

    // aqui va la relacion de 1-1 con reserva
    @OneToOne
    @JoinColumn(name = "fk_reserva")
    private Reserva reserva;

}
