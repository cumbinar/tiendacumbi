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
    @Disabled
    public void verificarSiSeGuardaCancionNueva() {
        GeneroMusical g = generoService.consultarGeneros(8);
        Cancion c = new Cancion("Agua de la Guayuza", 2010, "Segundo Pinchao", "Trio Fronterizo", "guayuza.jpg", g);
        Assertions.assertDoesNotThrow(() -> {
            cancionService.guardarCancion(c);
        }, "Error al guardar canción");
    }
    
    
}
