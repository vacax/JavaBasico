/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.herencia;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vacax
 */
public class PruebaHerencia {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Plantas plantas = new Plantas();
        Humano humano = new Humano("Carlos Camacho");

        mamifero.nacer();
        mamifero.comer();
        mamifero.tomarLeche();
        mamifero.reproducir();
        mamifero.morir();

        System.out.println("");

        plantas.nacer();
        plantas.comer();
        plantas.realizarFotoSintexis();
        plantas.reproducir();
        plantas.morir();

        System.out.println("");

        humano.nacer();
        humano.comer();
        humano.trabajar();
        humano.reproducir();
        humano.metodoQueNoPermiteLaSobreEscritura();
        humano.morir();
        
        System.out.println("");
        List<SeresVivos> listaSeresVivos =new ArrayList<>();
        listaSeresVivos.add(humano);
        listaSeresVivos.add(plantas);
        listaSeresVivos.add(mamifero);
        //listaSeresVivos.add(new Profesor());
        cicloVida(listaSeresVivos);
        
        System.out.println("");
        //Humano.CONSTANTE = 3; //no puedo realiarlo...
        Humano.PROFESOR.setNombre("Carlos camacho");
        Humano.PROFESOR.setCedula("031-0428131-0");
        Humano.PROFESOR.setFechaNacimiento(new Date());
        System.out.println("Datos del profesor: "+Humano.PROFESOR);
        //Humano.PROFESOR = new Profesor(); // Error, dado que la propiedad no permite cambio de referencia.
        

    }

    /**
     *
     * @param listaSeresVivos Representa un coleccion de datos.
     */
    public static void cicloVida(List<SeresVivos> listaSeresVivos) {
        for (SeresVivos seresVivos : listaSeresVivos) { //foreach en java
            seresVivos.nacer();
            seresVivos.comer();
            seresVivos.reproducir();
            seresVivos.morir();
        }
    }

}
