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
public abstract class FiguraGeometrica {
    
    String nombre;
    
    public abstract BigDecimal area(); //aplica para los metodos y no estan implementados.
    
    public abstract BigDecimal perimetro();
    
    public void mostrarNombre(){
        System.out.println(""+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
