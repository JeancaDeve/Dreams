package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends BaseEntity {
    @Column(name = "date_entrance", columnDefinition = "datetime")
    private String dateEntrance;

    @Column(name = "date_exit", columnDefinition = "datetime")
    private String dateExit;

    // * Muchas reservas pueden pertenecer a un usuario, relacion de m-1
    @ManyToOne
    @JoinColumn(name = "fk_user")
    private User user;

    // * Una reserva esta asociada a una habitacion

    @OneToOne
    @JoinColumn(name = "fk_room")
    private Room room;
}
