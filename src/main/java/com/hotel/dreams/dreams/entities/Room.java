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
    private int number;

    @Column(length = 500)
    private String description;

    @Column(columnDefinition = "char(1)")
    private String status = "1";
    @Column(length = 500)
    private String image;
   

}