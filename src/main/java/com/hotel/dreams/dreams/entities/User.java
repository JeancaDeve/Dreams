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
public class User extends BaseEntity {

    // ! Solo especificamos el nombre de la columna cuando usamos 'camelCase'

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false, name = "last_name")
    private String lastName;

    @Column(nullable = false, length = 9, columnDefinition = "char(9)", name = "phone_number") // un numero celular
                                                                                               // maximo es de 9 digitos
    private String phoneNumber;

    @Column(nullable = false, length = 8, columnDefinition = "char(8)") //un dni maximo es de 8 digitos
    private String dni;

    @Column(nullable = false, columnDefinition = "tinyint") //tinyint solo puede tener valores -127 o 127
    private int age;

    @Column(length = 255)
    private String password;
}
