package com.hotel.dreams.dreams.entities;

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
// * Esta es una clase base que tendra los atributos que tienen en comun todas
// las entidades
public class EntidadBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generacion automatica de id
    private int codigo;
}
