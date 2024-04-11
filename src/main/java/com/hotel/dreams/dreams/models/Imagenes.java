package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imagenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//imagenes que se mostraran par mejorar el ui/ux
public class Imagenes extends EntidadBase {
    @Column(length = 500)
    private String imagen;
    @Column(length = 500)
    private String descripcion;
}
