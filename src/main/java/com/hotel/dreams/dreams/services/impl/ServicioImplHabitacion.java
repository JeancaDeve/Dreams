package com.hotel.dreams.dreams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioHabitacion;
import com.hotel.dreams.dreams.services.ServicioHabitacion;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class ServicioImplHabitacion extends ServicioBaseImpl<Habitacion, Integer> implements ServicioHabitacion {

    @Autowired
    public RepositorioHabitacion _RepositorioHabitacion;

    public ServicioImplHabitacion(RepositorioBase<Habitacion, Integer> repositorioBase) {
        super(repositorioBase);

    }

    @Override
    public List<Habitacion> getHabitacionesDisponibles() throws Exception {
        try {
            return _RepositorioHabitacion.getHabitacionesDisponibles();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public int cambiarEstadoHabitacion(int codigo) throws Exception {
        try {
            return _RepositorioHabitacion.cambiarEstadoHabitacion(codigo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
