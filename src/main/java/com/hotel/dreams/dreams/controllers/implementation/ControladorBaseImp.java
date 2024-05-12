package com.hotel.dreams.dreams.controllers.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hotel.dreams.dreams.controllers.business.ControladorBase;
import com.hotel.dreams.dreams.models.EntidadBase;
import com.hotel.dreams.dreams.services.implementation.ServicioBaseImpl;

import java.util.List;

//@PreAuthorize("isAuthenticated()") //!Eliminar esto una vez este el front completo
public class ControladorBaseImp<E extends EntidadBase, S extends ServicioBaseImpl<E, Integer>>
        implements ControladorBase<E, Integer> {

    @Autowired
    protected S servicio;

    @Override
    @GetMapping("")
    public ResponseEntity<List<?>> getAll() throws Exception {
        try {
            List<E> _entidades = servicio.getAll();
            return ResponseEntity.status(HttpStatus.OK).body(_entidades);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id) throws Exception {
        try {
            E _entidad = servicio.getById(id);

            return _entidad != null ? ResponseEntity.status(HttpStatus.OK).body(_entidad)
                    : ResponseEntity.status(HttpStatus.OK).body(null);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity) throws Exception {
        try {
            servicio.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(entity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This is the error:" + e);
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody E entity) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error, intenetelo mas tarde");
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        try {
            servicio.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Se elimino correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar");
        }
    }

}
