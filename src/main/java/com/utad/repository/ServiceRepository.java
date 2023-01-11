package com.utad.repository;

import org.springframework.data.repository.CrudRepository;
import com.utad.model.Marcador;

/**
 * Interfaz a implantar por el servicio que extiende de crud repository que incloye las funciones basicas sobre la BD
 */
public interface ServiceRepository extends CrudRepository<Marcador,Integer>{
    
}


