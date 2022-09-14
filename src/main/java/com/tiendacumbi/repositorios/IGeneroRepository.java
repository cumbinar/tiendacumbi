/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendacumbi.repositorios;

import com.tiendacumbi.entidades.GeneroMusical;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author educu
 */
@Repository
public interface IGeneroRepository extends JpaRepository<GeneroMusical, Integer>{
    
    public List<GeneroMusical> findByNombreContainingOrCarpetaContaining(String criterio1, String criterio2);
}
