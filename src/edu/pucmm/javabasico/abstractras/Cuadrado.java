/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.abstractras;

import java.math.BigDecimal;

/**
 *
 * @author vacax
 */
public class Cuadrado extends FiguraGeometrica{

    BigDecimal lado;

    public Cuadrado(BigDecimal lado) {
        this.lado = lado;
    }   
    
    
    @Override
    public BigDecimal area() {
       return lado.multiply(lado);
    }

    @Override
    public BigDecimal perimetro() {
       return lado.multiply(new BigDecimal(4));
    }
    
    
}
