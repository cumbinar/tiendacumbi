/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.entidades;

/**
 *
 * @author educu
 */
public class GeneroMusical {
    private int id;
    private String nombre;
    private String carpeta;
    private boolean hab;

    public GeneroMusical() {
    }

    public GeneroMusical(String nombre, String carpeta, boolean hab) {
        this.nombre = nombre;
        this.carpeta = carpeta;
        this.hab = hab;
    }

    public GeneroMusical(int id, String nombre, String carpeta, boolean hab) {
        this.id = id;
        this.nombre = nombre;
        this.carpeta = carpeta;
        this.hab = hab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }
    
    
    
    
}
