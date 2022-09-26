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
        GeneroMusical g = new GeneroMusical("Rocky", "Rock and roll", true);
        GeneroMusical guardado = servicio.crearNuevoGenero(g);
        guardado.setNombre("Rock");
        guardado.setCarpeta("Rock en español");
        guardado.setHab(true);
        GeneroMusical actualizado = servicio.actualizarGenero(guardado);

        Assertions.assertTrue(actualizado.getCarpeta().equals("Rock and roll"), "ERROR no se pudo Actualizar genero");
        Assertions.assertTrue(actualizado.isHab() == false, "ERROR no se pudo actualizar genero");
    }
}
