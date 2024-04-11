package com.hotel.dreams.dreams.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hotel.dreams.dreams.models.EntidadBase;

public interface ControladorBase<E extends EntidadBase, ID> {
    public ResponseEntity<List<?>> getAll() throws Exception;

    public ResponseEntity<?> getOne(ID id) throws Exception;

    public ResponseEntity<?> save(E entity) throws Exception;

    public ResponseEntity<?> update(ID id, E entity) throws Exception;

    public ResponseEntity<?> delete(ID id) throws Exception;

}
