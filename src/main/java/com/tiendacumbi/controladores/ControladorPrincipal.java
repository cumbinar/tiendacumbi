/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author educu
 */
@Controller
public class ControladorPrincipal {

    @GetMapping("/")
    public String cargarIndex() {
        return "index";
    }
    
    @GetMapping("/canciones")
    public String modelosBotas(){
    return "listacanciones";
    }
}
