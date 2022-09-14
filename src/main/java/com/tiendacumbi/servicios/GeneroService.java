/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.servicios;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.repositorios.IGeneroRepository;
import java.util.List;
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

    public GeneroMusical crearNuevoGenero(GeneroMusical g) {
        GeneroMusical guardado = repo.save(g);
        return guardado;
    }

    public GeneroMusical actualizarGenero(GeneroMusical g) {
        GeneroMusical guardado = repo.save(g);
        return guardado;
    }

    public GeneroMusical consultarGeneros(int id) {
        GeneroMusical g = repo.findById(id).get();
        return g;
    }

    public List<GeneroMusical> consultarGeneros(String criterio) {
        List<GeneroMusical> lista = repo.findByNombreContainingOrCarpetaContaining(criterio, criterio);
        return lista;
    }

    public List<GeneroMusical> consultarGeneros() {
        List<GeneroMusical> lista = repo.findAll();
        return lista;
    }

    public List<GeneroMusical> consultarGenerosHabilitados() {
        List<GeneroMusical> lista = repo.findByHabTrue();
        return lista;
    }

    public void eliminarGenero(GeneroMusical g) {
        repo.delete(g);

    }

}
