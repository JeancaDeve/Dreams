package com.hotel.dreams.dreams.repositories;

import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Usuario;
import java.util.Optional;

@Repository
public interface RepositorioUsuario extends RepositorioBase<Usuario, Integer> {
    public Optional<Usuario> findByNumeroCelular(String numeroCelular);
}
