/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.sevicios;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.repositorios.IGeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author educu
 */
@Service
public class GeneroService {
    
    @Autowired
    private IGeneroRepository repo;
    
    public GeneroMusical crearNuevoGenero(GeneroMusical g){
        GeneroMusical guardado = repo.save(g);
        return guardado;
    }
    public void actualizarGenero(){
        
    }
    public void consultarGeneros(){
    }
    public void eliminarGenero(){
    }
    
}

