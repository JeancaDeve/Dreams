package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    // Muchas reservas pueden pertenecer a un usuario, relacion de m-1
    @ManyToOne
    @JoinColumn(name = "fk_usuario")
    private Usuario usuario;

    // Una reserva esta asociada a una habitacion

    @OneToOne
    @JoinColumn(name = "fk_habitacion")
    private Habitacion habitacion;

}
