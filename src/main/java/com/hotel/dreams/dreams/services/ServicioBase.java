package com.hotel.dreams.dreams.services;

import java.util.List;

import com.hotel.dreams.dreams.models.EntidadBase;

public interface ServicioBase<E extends EntidadBase, ID> {
    // * estos son los servicios generales que tendran cada clase (entidad)

    public List<E> getAll() throws Exception; // retorna todas las filas de la tabla E

    public E getById(ID id) throws Exception; // retorna una fila de la tabla E

    public E save(E entity) throws Exception; // guarda una fila en la tabla E

    public E update(ID id, E entity) throws Exception; // actualiza una fila en la tabla E

    public boolean delete(ID id) throws Exception; // elimina una fila en la tabla E

}
