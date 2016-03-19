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
public class Plantas extends SeresVivos {

    String color;
    String tamaño;
    //Otras propiedades.

    //Acciones de una planta.
    public void realizarFotoSintexis() {
        System.out.println("Foto: " + this.getClass().getName());
    }

}
