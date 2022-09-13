/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.servicios.GeneroService;
import org.junit.jupiter.api.Assertions;
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
    void verificarSiSeGuardaUnGeneroNuevo() {
        GeneroMusical g = new GeneroMusical("Bolero", "Ecuatoriano", true);
        GeneroMusical guardado = servicio.crearNuevoGenero(g);
        Assertions.assertTrue(guardado.getId() > 0, "ERROR no se pudo guardar nuevo genero");
    }

}
