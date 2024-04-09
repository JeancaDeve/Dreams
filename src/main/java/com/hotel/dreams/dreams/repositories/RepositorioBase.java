package com.hotel.dreams.dreams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.hotel.dreams.dreams.entities.EntidadBase;

@NoRepositoryBean
public interface RepositorioBase<E extends EntidadBase, ID > extends JpaRepository<E, ID> {

}
