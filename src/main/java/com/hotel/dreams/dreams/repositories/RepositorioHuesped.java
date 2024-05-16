package com.hotel.dreams.dreams.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Huesped;
import java.util.Optional;

@Repository
public interface RepositorioHuesped extends RepositorioBase<Huesped, Integer> {

  public Optional<Huesped> findByDni(String numeroDni);

  // metodo para buscar una entidad por todos su atributos menos el id
  @Query("SELECT h FROM Huesped h WHERE " +
      " h.nombres = :#{#huesped.nombres}" +
      " AND h.apellidos = :#{#huesped.apellidos} " +
      " AND h.numeroCelular = :#{#huesped.numeroCelular} " +
      " AND h.dni = :#{#huesped.dni} " +
      " AND h.fechaNacimiento = :#{#huesped.fechaNacimiento}")
  public Optional<Huesped> findByAll(@Param("huesped") Huesped huesped);

  public Optional<Huesped> findByNumeroCelular(String numeroCelular);

}
