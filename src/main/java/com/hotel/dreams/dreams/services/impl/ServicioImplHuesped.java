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
import java.util.Optional;

import jakarta.transaction.Transactional;

@Service
public class ServicioImplHuesped extends ServicioBaseImpl<Huesped, Integer> implements ServicioHuesped {
    @Autowired
    protected RepositorioHabitacion _RepositorioHabitacion;

    @Autowired
    protected RepositorioHuesped _RepositorioHuesped;

    public ServicioImplHuesped(RepositorioBase<Huesped, Integer> repositorioBase) {
        super(repositorioBase);
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public boolean hacerReserva(Huesped huesped, int idHabitacion) throws Exception {
        // todo : Mejorar la funcionalidad de la reserva
        // ! hacer que si una habitacion ya esta resrevada, no se pueda reservar de
        // ! nuevo
        try {
            // obtenemos el año actual y el anio de nacimiento del huespede
            int anioNacimiento = Integer.parseInt(huesped.getFechaNacimiento().substring(0, 4));
            int anioActual = LocalDate.now().getYear();
            Huesped huespedReserva = null;

            // Verificamos si el heusped ya existe en la base de datos
            Optional<Huesped> huespedExistente = _RepositorioHuesped.findByDni(huesped.getDni());

            // verificamos si el huesped es mayor de edad
            if ((anioActual - anioNacimiento) >= 18) {

                if (huespedExistente.isPresent()) {
                    // si el heusped ya se ecuentra registrado
                    huespedReserva = huespedExistente.get();
                }

                // si el huesped no se encuentra registrado
                if (huespedReserva == null) {
                    // huespedReserva = huesped;
                    _RepositorioHuesped.save(huesped);
                } else {
                    huespedReserva.getReservas().add(huesped.getReservas().get(0));
                    _RepositorioHuesped.save(huespedReserva);
                }

                _RepositorioHabitacion.cambiarEstadoHabitacion(idHabitacion);
                return true;
            } else {
                throw new Exception("!MenorEdad");
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
