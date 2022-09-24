/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendacumbi.controladores;

import com.tiendacumbi.entidades.GeneroMusical;
import com.tiendacumbi.servicios.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author educu
 */
@CrossOrigin("*")
@RestController
public class GenerosWebController {

    @Autowired
    private GeneroService servicio;

    @GetMapping("/api/generos")
    public ResponseEntity<List<GeneroMusical>> consultarGeneros() {
        List<GeneroMusical> lista = servicio.consultarGeneros();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
