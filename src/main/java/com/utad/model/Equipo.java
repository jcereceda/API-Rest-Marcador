package com.utad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Estrategia a seguir por el id como AutoIncrement
    private int id;
    @Column
    private String nombre;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column
    private String escudo;

    public Equipo(){}
    
    public Equipo(String nombre, String escudo) {
        this.nombre = nombre;
        this.escudo = escudo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEscudo() {
        return escudo;
    }
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
}
