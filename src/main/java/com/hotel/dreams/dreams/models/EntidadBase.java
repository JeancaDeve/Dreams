package com.hotel.dreams.dreams.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntidadBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generacion automatica de id
    private int codigo;
}
