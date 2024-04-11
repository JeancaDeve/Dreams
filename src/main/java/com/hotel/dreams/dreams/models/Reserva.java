package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Reserva extends EntidadBase {
    @Column(name = "fecha_entrada", columnDefinition = "datetime")
    private String fechaEntrada;

    @Column(name = "fecha_salida", columnDefinition = "datetime")
    private String fechaSalida;

    @Column(columnDefinition = "char(1)")
    private String estado = "1"; // 1 = en ejecucion, 0 = cancelado

    @Column(columnDefinition = "datetime", name = "fecha_reserva")
    private String fechaReserva;

}
