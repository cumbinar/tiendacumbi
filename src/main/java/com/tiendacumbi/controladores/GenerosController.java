/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.controladores;

import com.tiendacumbi.servicios.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * index.html / listageneros.html /generos formgeneros.html /generos/form/{id}
 *
 * @author educu
 */
@Controller
public class GenerosController {

    @Autowired
    private GeneroService servicio;

    @GetMapping("/index")
    public String cargarIndex() {
        return "index";
    }

    @GetMapping("/listageneros")
    public String cargarListaGeneros(Model modelo, @RequestParam(value="criterio", required=false)  String criterio) {
        if (criterio == null){
        modelo.addAttribute("generos", servicio.consultarGeneros());
        }
        else{
            modelo.addAttribute("generos", servicio.consultarGeneros(criterio));
            modelo.addAttribute("criterio", criterio);
        }
        return "listageneros";
    }

    @GetMapping("/formgeneros")
    public String cargarFormGeneros() {
        return "formgeneros";
    }

   
}
