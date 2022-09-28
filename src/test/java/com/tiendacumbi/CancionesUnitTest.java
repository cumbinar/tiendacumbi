/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi;

import com.tiendacumbi.entidades.Cancion;
import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.servicios.CancionService;
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
public class CancionesUnitTest {

    @Autowired
    private GeneroService generoService;

    @Autowired
    private CancionService cancionService;

    @Test
    public void verificarSiSeGuardaCancionNueva() {
        GeneroMusical g = generoService.consultarGeneros(2);
        Cancion c = new Cancion("canoa ranchá", 2010, "Jairo Varela", "Grupo Niche", "canoarancha.jpg", g);
        Assertions.assertDoesNotThrow(() -> {
            cancionService.guardarCancion(c);
        }, "Error al guardar canción");

    }

}
