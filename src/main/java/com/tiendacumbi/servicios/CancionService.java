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

    public Cancion cargarCancion(int id) {
        return cancionRepo.findById(id).orElse(null);
    }

    public Cancion guardarCancion(Cancion c) {
        return cancionRepo.save(c);
    }

    public boolean eliminarCancion(int id) {

        Cancion c = cancionRepo.findById(id).orElse(null);
        if (c == null) {
            return false;
        } else {
            cancionRepo.delete(c);
            return true;
        }
    }

    public void eliminarCancion(Cancion c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
