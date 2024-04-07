package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
//* Esta es una clase base que tendra los atributos que tienen en comun todas las entidades
public class BaseEntity {
    @Id
    @Column(length = 200, nullable =  false)
    private String code; //? ejemplo code (USER13242)
}
 