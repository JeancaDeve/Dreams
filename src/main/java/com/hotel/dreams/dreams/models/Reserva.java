package com.hotel.dreams.dreams.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ESta es la entidad reserva que se encarga de almacenar la informacion de las
 * reservas
 * 
 * @param fechaEntrada : Esta sera la fecha que se hace ingreso a la hbaitacion
 * @param fechaSalida  : Esta sera la fecha que se hace salida de la habitacion
 * @param estado       : Se marca 1 si esta disponible, 0 si esta reservada
 * @param fechaReserva : Esta sera la fecha que se hace la reserva
 * @param habitacion   : es la habitacion a la que esta destinada la reserva
 *                     (@ManyToOne)
 * @param factura      : es la factura que se genera al momento de hacer la
 *                     reserva
 *                     (@OneToOne)
 * 
 * 
 */
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

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Factura factura;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Habitacion habitacion;

}
