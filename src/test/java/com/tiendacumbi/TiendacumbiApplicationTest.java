/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.servicios.GeneroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author educu
 */
@SpringBootTest
public class TiendacumbiApplicationTest {

    @Autowired
    private GeneroService servicio;

    @Test
    @Disabled
    void verificarSiSeGuardaUnGeneroNuevo() {
        GeneroMusical g = new GeneroMusical("Albazo", "Rocksito", true);
        GeneroMusical guardado = servicio.crearNuevoGenero(g);
        Assertions.assertTrue(guardado != null, "ERROR no se pudo guardar nuevo genero");
    }

    @Test
    @Disabled
    void verificarSiSeActualizaUnGenero() {

        /**
         *
         * Este test tiene un error
         */
        GeneroMusical g = new GeneroMusical("RoLyn", "Rolysing", true);
        GeneroMusical guardado = servicio.crearNuevoGenero(g);
        guardado.setNombre("RoLon");
        guardado.setCarpeta("Rollons");
        guardado.setHab(true);
        GeneroMusical actualizado = servicio.actualizarGenero(guardado);

        Assertions.assertTrue(actualizado.getCarpeta().equals("Rollons"), "ERROR no se pudo Actualizar genero");
        Assertions.assertTrue(actualizado.isHab() == false, "ERROR no se pudo actualizar genero");
    }
}
