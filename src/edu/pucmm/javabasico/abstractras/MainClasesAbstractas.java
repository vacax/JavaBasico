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
public class MainClasesAbstractas {
    
    public static void main(String[] args) {
        //Como tengo implementado los metodos abstractos lo llamo directo es transparente
        Cuadrado cuadrado=new Cuadrado(new BigDecimal(5));
        System.out.println("El area del cuadrado es: "+cuadrado.area());
        System.out.println("El perimetro del cuadrado es: "+cuadrado.perimetro());
        //
        FiguraGeometrica circulo = new FiguraGeometrica() {
            @Override
            public BigDecimal area() {
                return new BigDecimal(20);
            }

            @Override
            public BigDecimal perimetro() {
                return new BigDecimal(100);
            }
        };
        System.out.println("El area del circulo es: "+circulo.area());
        System.out.println("El perimetro del circulo es: "+circulo.perimetro());
        
    }
    
    
}
