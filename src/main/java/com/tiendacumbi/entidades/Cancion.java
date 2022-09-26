/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author educu
 */
@Entity
@Table(name = "tcanciones" )
public class Cancion {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre", length=45, nullable=false, unique=false )
    private String nombre;
    
    @Column(name = "anioPublicacion", nullable =false, unique = false)
    private int anioPublicacion;
    
    @Column(name = "compositor", length=70, nullable = false, unique = false )
    private String compositor;
    
    @Column (name = "interprete", length=70, nullable = false, unique = false )
    private String interprete;
    
    @Column (name = "imagen", length=45, nullable = false, unique = true )
    private String imagen;
    
    @ManyToOne
    @JoinColumn(name = "idGeneroMusical")
    private GeneroMusical genero;    

    public Cancion() {
    }
    
    

    public Cancion(String nombre, int anioPublicacion, String compositor, String interprete, String imagen, GeneroMusical genero) {
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.compositor = compositor;
        this.interprete = interprete;
        this.imagen = imagen;
        this.genero = genero;
    }

    public Cancion(int id, String nombre, int anioPublicacion, String compositor, String interprete, String imagen, GeneroMusical genero) {
        this.id = id;
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.compositor = compositor;
        this.interprete = interprete;
        this.imagen = imagen;
        this.genero = genero;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }
    
    
}


