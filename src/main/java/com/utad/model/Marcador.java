package com.utad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Clase POJO
 */
@Entity
@Table(name="marcador")
public class Marcador {
    
    // Marcar la clave primaria de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Estrategia a seguir por el id como AutoIncrement
    private int id;
    @Column // Será una columna de la tabla
    private String equipoLocal;
    @Column
    private String equipoVisitante;
    @Column
    private int golesLocal;
    @Column
    private int golesVisitante;
    @Column
    private int amarillasLocal;
    @Column
    private int amarillasVisitante;
    @Column
    private int rojasLocal;
    @Column
    private int rojasVisitante;
    @Column
    private int cornerLocal;
    @Column
    private int cornerVisitante;
    @Column
    private int tirosLocal;
    @Column
    private int tirosVisitante;
    
    // Constructor por defecto vacio
    public Marcador() {
        golesLocal = 0;
        golesVisitante = 0;
    }

    public Marcador(int id, String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante,
            int amarillasLocal, int amarillasVisitante, int rojasLocal, int rojasVisitante, int cornerLocal,
            int cornerVisitante, int tirosLocal, int tirosVisitante) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.amarillasLocal = amarillasLocal;
        this.amarillasVisitante = amarillasVisitante;
        this.rojasLocal = rojasLocal;
        this.rojasVisitante = rojasVisitante;
        this.cornerLocal = cornerLocal;
        this.cornerVisitante = cornerVisitante;
        this.tirosLocal = tirosLocal;
        this.tirosVisitante = tirosVisitante;
    }

    // Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public int getGolesLocal() {
        return golesLocal;
    }
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }
    public int getGolesVisitante() {
        return golesVisitante;
    }
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    public int getAmarillasLocal() {
        return amarillasLocal;
    }
    public void setAmarillasLocal(int amarillasLocal) {
        this.amarillasLocal = amarillasLocal;
    }
    public int getAmarillasVisitante() {
        return amarillasVisitante;
    }
    public void setAmarillasVisitante(int amarillasVisitante) {
        this.amarillasVisitante = amarillasVisitante;
    }
    public int getRojasLocal() {
        return rojasLocal;
    }
    public void setRojasLocal(int rojasLocal) {
        this.rojasLocal = rojasLocal;
    }
    public int getRojasVisitante() {
        return rojasVisitante;
    }
    public void setRojasVisitante(int rojasVisitante) {
        this.rojasVisitante = rojasVisitante;
    }
    public int getCornerLocal() {
        return cornerLocal;
    }
    public void setCornerLocal(int cornerLocal) {
        this.cornerLocal = cornerLocal;
    }
    public int getCornerVisitante() {
        return cornerVisitante;
    }
    public void setCornerVisitante(int cornerVisitante) {
        this.cornerVisitante = cornerVisitante;
    }
    public int getTirosLocal() {
        return tirosLocal;
    }
    public void setTirosLocal(int tirosLocal) {
        this.tirosLocal = tirosLocal;
    }
    public int getTirosVisitante() {
        return tirosVisitante;
    }
    public void setTirosVisitante(int tirosVisitante) {
        this.tirosVisitante = tirosVisitante;
    }

    @Override
    public String toString() {
        return "Marcador [id=" + id + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
                + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + ", amarillasLocal="
                + amarillasLocal + ", amarillasVisitante=" + amarillasVisitante + ", rojasLocal=" + rojasLocal
                + ", rojasVisitante=" + rojasVisitante + ", cornerLocal=" + cornerLocal + ", cornerVisitante="
                + cornerVisitante + ", tirosLocal=" + tirosLocal + ", tirosVisitante=" + tirosVisitante + "]";
    }
}
