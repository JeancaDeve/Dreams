package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill extends BaseEntity {
    @Column(columnDefinition = "char(11)")
    private String ruc;
    @Column(columnDefinition = "float")
    private double amount;
    @Column(columnDefinition = "datetime")
    private double date;

    // * aqui va la ra relacion de 1-1 con reserva
    @OneToOne
    @JoinColumn(name = "fk_reservation")
    private Reservation reservation;

}
