package com.utad.repository;

import org.springframework.data.repository.CrudRepository;
import com.utad.model.Equipo;

/**
 * Interfaz a implantar por el servicio que extiende de crud repository que incloye las funciones basicas sobre la BD
 */
public interface EquiposRepository extends CrudRepository<Equipo,Integer>{
    
}
