package com.tiendacumbi;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.sevicios.GeneroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TiendacumbiApplicationTests {
    @Autowired
    private GeneroService servicio;
    @Test
	void verificarSiSeGuardaUnGeneroNuevo() {
            GeneroMusical g = new GeneroMusical("Rock en español", "Rock", true);
            GeneroMusical guardado = servicio.crearNuevoGenero(g);
            Assertions.assertTrue(guardado.getId() > 0, "ERROR no se pudo guardar nuevo genero");
	}

}
