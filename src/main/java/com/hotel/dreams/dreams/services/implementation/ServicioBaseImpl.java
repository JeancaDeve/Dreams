package com.hotel.dreams.dreams.services.implementation;

import java.util.List;
import java.util.Optional;

import com.hotel.dreams.dreams.models.EntidadBase;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.services.business.ServicioBase;

import jakarta.transaction.Transactional;

public class ServicioBaseImpl<E extends EntidadBase, ID> implements ServicioBase<E, ID> {

    RepositorioBase<E, ID> _RepositorioBase;

    public ServicioBaseImpl(RepositorioBase<E, ID> repositorioBase) {
        this._RepositorioBase = repositorioBase;
    }

    @Override
    @Transactional
    public List<E> getAll() throws Exception {
        try {
            return _RepositorioBase.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E getById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = _RepositorioBase.findById(id);
            return entityOptional.isPresent() ? entityOptional.get() : null;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return _RepositorioBase.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entidad = _RepositorioBase.findById(id);
            if (entidad.isPresent()) {
                E entidadExistente = entidad.get();
                entidadExistente = _RepositorioBase.save(entity);
                return entidadExistente;
            } else {
                throw new Exception("No se econtro la entidad con id " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            Optional<E> entidad = _RepositorioBase.findById(id);
            if (entidad.isPresent()) {
                _RepositorioBase.deleteById(id);
                return true;
            } else {
                throw new Exception("No se econtro la entidad con id " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}