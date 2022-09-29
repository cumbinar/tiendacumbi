/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.controladores;

import com.tiendacumbi.entidades.Cancion;
import com.tiendacumbi.servicios.CancionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author educu
 */
@Controller
public class CancionesController {

    @Autowired
    private CancionService cancionService;

    /**
     * @GetMapping("/listacanciones") public String cargarlistaCanciones(Model
     * model) { List<Cancion> canciones = cancionService.cargarCanciones();
     * model.addAttribute("canciones", canciones); return "listacanciones"; }
     */

    @GetMapping("/listacanciones")
    public String cargarlistaCancionesPorCriterio(Model model, @RequestParam(name = "criterio", required = false) String criterio) {
        List<Cancion> canciones;
        if (criterio == null) {
            canciones = cancionService.cargarCanciones();

        } else {
            canciones = cancionService.cargarCancionesPorCriterio(criterio);

        }
        model.addAttribute("canciones", canciones);
        return "listacanciones";
    }

    /**
     * @GetMapping("/listacanciones") public String cargarListaCanciones() {
     * return "listacanciones"; }
     */
}
