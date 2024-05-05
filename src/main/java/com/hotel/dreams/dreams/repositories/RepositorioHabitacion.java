package com.hotel.dreams.dreams.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.dreams.dreams.models.Habitacion;
import java.util.List;

@Repository
public interface RepositorioHabitacion extends RepositorioBase<Habitacion, Integer> {

  /**
   * Devuelve las habitaciones disponibles en el hotel
   * 
   * @return Lista de habitaciones disponibles
   */
  @Query("SELECT h FROM Habitacion h WHERE h.estado = '1'")
  public List<Habitacion> getHabitacionesDisponibles() throws Exception;

  @Modifying
  @Query("UPDATE Habitacion SET estado = CASE WHEN estado = '0' THEN '1' ELSE '0' END WHERE id = :codigo")
  public int cambiarEstadoHabitacion(int codigo) throws Exception;

}
