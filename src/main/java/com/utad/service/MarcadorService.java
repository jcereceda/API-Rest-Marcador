package com.utad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utad.model.Marcador;
import com.utad.repository.ServiceRepository;
/**
 * Clase servicio:
 * Siguiendo el MVC el servicio contacta con la BD a traves del repositorio CRUD
 */

@Service
public class MarcadorService{

    @Autowired
    private ServiceRepository repository;
    
    public List<Marcador> getAllPartidos() {
        List partidos = new ArrayList<Marcador>();
        repository.findAll().forEach(partidos::add);
        return partidos;
    }

    public Marcador getPartido(int id) {
        return repository.findById(id).get();
    }

    public void savePartido(Marcador marcador) {
        repository.save(marcador);
    }

    public void dropPartido(int id) {
        repository.deleteById(id);
    }

    public void updateMarcador(Marcador marcador) {
        repository.save(marcador);
    }

}