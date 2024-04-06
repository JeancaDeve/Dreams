package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hotel_images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelImages extends BaseEntity{
    @Column(length = 500)
    private String image;
    @Column(length = 500)
    private String description;
}
