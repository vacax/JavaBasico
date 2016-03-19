/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.herencia;

/**
 *
 * @author vacax
 */
public class SeresVivos {
    
    String nombre;
    String especie;
    
      public void nacer(){
        System.out.println("Naciendo: "+this.getClass().getName());
    }
    
    public void comer(){
        System.out.println("Comiendo: "+this.getClass().getName());
    }
    
    public void reproducir(){
        System.out.println("Reproducción: "+this.getClass().getName());
    }
    
    public void morir(){
        System.out.println("Morir: "+this.getClass().getName());
    }
    
    
    
}
