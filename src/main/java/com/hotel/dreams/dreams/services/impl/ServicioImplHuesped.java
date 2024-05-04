package com.hotel.dreams.dreams.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioHabitacion;
import com.hotel.dreams.dreams.repositories.RepositorioHuesped;
import com.hotel.dreams.dreams.services.ServicioHuesped;

import jakarta.transaction.Transactional;

@Service
public class ServicioImplHuesped extends ServicioBaseImpl<Huesped, Integer> implements ServicioHuesped {

    /*
     * @Autowired
     * protected RepositorioHuesped _RepositorioHuesped;
     */

    @Autowired
    protected RepositorioHabitacion _RepositorioHabitacion;

    @Autowired
    protected RepositorioHuesped _RepositorioHuesped;

    public ServicioImplHuesped(RepositorioBase<Huesped, Integer> repositorioBase) {
        super(repositorioBase);
    }

    @Transactional
    @Override
    public boolean hacerReserva(Huesped huesped, int idHabitacion) {

        // ! falta coreggir
        // ? no se hace uso de la fk, sino se se ceran nuevas entidades

        try {
            int anioNacimiento = Integer.parseInt(huesped.getFechaNacimiento().substring(0, 4));
            int anioActual = LocalDate.now().getYear();
            List<String> numeroCelularHuespedes = _RepositorioHuesped.findAll()
                    .stream()
                    .map(Huesped::getNumeroCelular)
                    .toList();

            System.out.println("anioActual: " + anioActual + "anioNacimiento: " + anioNacimiento);

            if ((anioActual - anioNacimiento) >= 18) {

                if (!numeroCelularHuespedes.contains(huesped.getNumeroCelular())) {
                    _RepositorioHuesped.save(huesped);
                } else {
                    Huesped huespedActual = huesped;
                    huespedActual.getReservas().get(0);
                    _RepositorioHuesped.save(huespedActual);
                }

                _RepositorioHabitacion.cambiarEstadoHabitacion(idHabitacion);

                return true;
            } else
                return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
