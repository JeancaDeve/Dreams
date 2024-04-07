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
public class Room extends BaseEntity {
    @Column(columnDefinition = "tinyint")
    private int number; //numero de habitacion

    @Column(length = 500)
    private String description; //especificamos que con que cuenta la habitacion

    @Column(columnDefinition = "char(1)")
    private String status = "1"; //1 = disponible, 0 = ocupado
    @Column(length = 500)
    private String image;
   

}