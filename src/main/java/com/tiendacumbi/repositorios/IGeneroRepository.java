/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendacumbi.repositorios;

import com.tiendacumbi.entidades.GeneroMusical;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author educu
 */
public interface IGeneroRepository extends JpaRepository<GeneroMusical, Integer>{
    
}
