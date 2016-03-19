/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.interfases.paisa;

import edu.pucmm.javabasico.interfases.Cientifico;

/**
 *
 * @author vacax
 */
public class CientificoA extends Cientifico implements IMilitar{

    @Override
    public void disparar() {
       System.out.println("Cientifico dispara el arma...");   
    }

    @Override
    public void seguirOrdenes() {
        System.out.println("Cientifico sigue ordenes...");  
    }
    
    
}
