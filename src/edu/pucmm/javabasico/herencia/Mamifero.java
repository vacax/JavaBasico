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
public class Mamifero extends SeresVivos {

    String sexo;
    /// Otras propiedades....

    //Metodos o acciones:
    public void tomarLeche() {
        System.out.println("Tomando Leche: " + this.getClass().getName());
    }
    
    /**
     * Para evitar la sobre escritura de un metodo en una clase hijo.
     * lo realizo con la palabra reservada final en el metodo.
     */
    public final void metodoQueNoPermiteLaSobreEscritura(){
        System.out.println("No puede ser sobre escrito.");
    }

}
