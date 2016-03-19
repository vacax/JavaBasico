/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.interfases.paisa;

/**
 *
 * @author vacax
 */
public interface IMilitar {
    
    //Todas las propiedades una interfaz son constantes, publicas, estaticas y final.
    public static final int CONSTANTE = 1;
    int CONSTANTE2 = 2; //de forma implicita está el public static final....
    
    //Todos los metodos son abstractros.
    public abstract void disparar();
    
    void seguirOrdenes(); // el publico y abstracto está implicito....
    
}
