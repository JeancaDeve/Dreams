package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Huesped;
import java.util.Optional;

@Repository
public interface RepositorioHuesped extends RepositorioBase<Huesped, Integer> {
  public Optional<Huesped> findByDni(String numeroCelular);
}
