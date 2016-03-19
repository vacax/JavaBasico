/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.interfases;

import edu.pucmm.javabasico.interfases.paisa.CientificoA;
import edu.pucmm.javabasico.interfases.paisa.IMilitar;
import edu.pucmm.javabasico.interfases.paisa.MilitarA;
import edu.pucmm.javabasico.interfases.paisa.TrabajadorA;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vacax
 */
public class MainInterfases {

    public static void main(String[] args) {
        //Pais A.
        MilitarA militarA = new MilitarA();
        TrabajadorA trabajadorA = new TrabajadorA();
        CientificoA cientificoA = new CientificoA();

        //Pais B.
        Militar militarB = new Militar();
        Trabajador trabajadorB = new Trabajador();
        Cientifico cientificoB = new Cientifico();

        //Guerra:
        militarA.disparar();
        militarB.disparar();

        trabajadorA.trabajar();
        trabajadorB.trabajar();
        //trabajadorB.disparar(); // no implementado.
        trabajadorA.disparar();
        cientificoA.disparar();

        //
        List<IMilitar> lista = new ArrayList<>();
        lista.add(cientificoA);
        lista.add(trabajadorA);
        //lista.add(trabajadorB); //no es posible, Trabajador no implementa esa interfase.
        IMilitar militarAnonimo = new IMilitar() {
            @Override
            public void disparar() {
                System.out.println("Disparando el militar anonimo....");
            }

            @Override
            public void seguirOrdenes() {
                System.out.println("Seguir ordenes el militar anonimo....");
            }
        };
        lista.add(militarAnonimo);
        dispararCiudadanosPaisA(lista);

    }

    /**
     * Aplicando concepto de polimorfismo
     * @param lista 
     */
    public static void dispararCiudadanosPaisA(List<IMilitar> lista) {
        for (IMilitar militar : lista) {
            militar.disparar();
            militar.seguirOrdenes();
        }
    }

}
