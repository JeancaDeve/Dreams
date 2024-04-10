package com.hotel.dreams.dreams.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imagenes_hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ImagenesHotel extends EntidadBase {
    @Column(length = 500)
    private String imagen;
    @Column(length = 500)
    private String descripcion;
}
