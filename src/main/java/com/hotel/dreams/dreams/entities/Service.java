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
public class Service extends BaseEntity{
    @Column(length = 500)
    private String icon;
    @Column(length = 30)
    private String name;
}

