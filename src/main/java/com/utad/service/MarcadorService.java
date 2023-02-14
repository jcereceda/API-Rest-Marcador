package com.utad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utad.model.Marcador;
import com.utad.model.Equipo;
import com.utad.repository.ServiceRepository;
import com.utad.repository.EquiposRepository;
/**
 * Clase servicio:
 * Siguiendo el MVC el servicio contacta con la BD a traves del repositorio CRUD
 */

@Service
public class MarcadorService{

    @Autowired
    private ServiceRepository repository;
    @Autowired
    private EquiposRepository equiposRepository;

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
        System.out.println(marcador.getEquipoLocal());
        System.out.println(marcador.getEquipoVisitante());
    }

    public void dropPartido(int id) {
        repository.deleteById(id);
    }

    public void updateMarcador(Marcador marcador) {
        repository.save(marcador);
    }

    public List<Equipo> getAllEquipos(){
        List equipos = new ArrayList<Equipo>();
        equiposRepository.findAll().forEach(equipos::add);
        return equipos;
    }
}