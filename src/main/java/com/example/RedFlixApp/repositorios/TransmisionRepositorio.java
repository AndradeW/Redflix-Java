/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RedFlixApp.repositorios;

/**
 *
 * @author Andrés Candela
 */
import com.example.RedFlixApp.modelos.Transmision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TransmisionRepositorio extends JpaRepository <Transmision,Integer> {
    
}
