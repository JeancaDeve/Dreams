package com.hotel.dreams.dreams.models;

import org.hibernate.annotations.CurrentTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class Reserva extends EntidadBase {
    @Column(name = "fecha_entrada", columnDefinition = "datetime")
    private String fechaEntrada;

    @Column(name = "fecha_salida", columnDefinition = "datetime")
    private String fechaSalida;

    @Column(columnDefinition = "char(1)")
    @Builder.Default
    private String estado = "1"; // 1 = en ejecucion, 0 = cancelado

    @Column(columnDefinition = "datetime", name = "fecha_reserva")
    @CurrentTimestamp
    private String fechaReserva;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Factura factura;

    @ManyToOne
    private Habitacion habitacion;

}
