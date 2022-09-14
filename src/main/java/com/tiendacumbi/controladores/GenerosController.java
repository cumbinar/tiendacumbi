/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *index.html /
 * listageneros.html /generos
 * formgeneros.html /generos/form/{id}
 * @author educu
 */
@Controller
public class GenerosController {
    
    @GetMapping("/")
    public String cargarIndex(){
        return "index";
    }
    
    @GetMapping("/generos")
    public String cargarListaGeneros(){
        return "listageneros";
    }
    
    
    @GetMapping("/generos/form")
    public String cargarFormGeneros(){
        return "formgeneros";
    }
}

