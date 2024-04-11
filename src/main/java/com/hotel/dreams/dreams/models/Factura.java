package com.hotel.dreams.dreams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Factura extends EntidadBase {

    @Column(columnDefinition = "char(11)")
    private String ruc; //un ruc por defecto son de 11 digitos (65432156785)
    @Column(columnDefinition = "float")
    private double monto;
    @Column(columnDefinition = "datetime")
    private double fecha;

}
