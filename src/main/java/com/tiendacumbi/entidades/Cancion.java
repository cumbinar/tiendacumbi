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
}
