/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.servicios;

import com.tiendacumbi.entidades.Cancion;
import com.tiendacumbi.repositorios.ICancionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author educu
 */
@Service
public class CancionService {

    @Autowired
    private ICancionRepository cancionRepo;

    public List<Cancion> cargarCanciones() {
        return cancionRepo.findAll();
    }
    
     public List<Cancion> cargarCancionesPorCriterio(String criterio) {
        return cancionRepo.findByNombreContainingOrCompositorContainingOrInterpreteContaining(criterio, criterio, criterio);
     }
     
    public Cancion cargarCancion(int id){
    return cancionRepo.findById(id).orElse (null);
    }
    
    public Cancion guardarCancion(Cancion c){
    return cancionRepo.save(c);
    }
    
    public void eliminarCancion(int id){
    
    cancionRepo.deleteById(id);
    }
    
    
}
