/*
 * Punto 8 de la práctica #1
 */
package edu.pucmm.javabasico.practica1;

/**
 *
 * @author vacax
 */
public class Bombillo {

    private boolean encendida;
    public static boolean breaker = true;

    public Bombillo() {
    }

    public Bombillo(boolean encendida) {
        this.encendida = encendida;
    }

    public void interruptor() {
        encendida = !encendida;
    }

    public boolean isEncendida() {
        return encendida && breaker;
    }

    public static void main(String[] args) {

        Bombillo bombillo1 = new Bombillo(true);
        Bombillo bombillo2 = new Bombillo(); //por defecto apagada.
        Bombillo bombillo3 = new Bombillo(true);

        System.out.println("");
        System.out.println("b1: " + bombillo1.isEncendida());
        System.out.println("b2: " + bombillo2.isEncendida());
        System.out.println("b3: " + bombillo3.isEncendida());

        bombillo1.interruptor();
        bombillo2.interruptor();
        bombillo3.interruptor();

        System.out.println("");
        System.out.println("b1: " + bombillo1.isEncendida());
        System.out.println("b2: " + bombillo2.isEncendida());
        System.out.println("b3: " + bombillo3.isEncendida());

        bombillo1.interruptor();
        bombillo2.interruptor();
        bombillo3.interruptor();
        
        System.out.println("");
        System.out.println("b1: " + bombillo1.isEncendida());
        System.out.println("b2: " + bombillo2.isEncendida());
        System.out.println("b3: " + bombillo3.isEncendida());
        
        Bombillo.breaker = false;
        
        System.out.println("Breaker apagado....");
        System.out.println("b1: " + bombillo1.isEncendida());
        System.out.println("b2: " + bombillo2.isEncendida());
        System.out.println("b3: " + bombillo3.isEncendida());
        
         Bombillo.breaker = true;
        
        System.out.println("Breaker encendido:");
        System.out.println("b1: " + bombillo1.isEncendida());
        System.out.println("b2: " + bombillo2.isEncendida());
        System.out.println("b3: " + bombillo3.isEncendida());

    }

}
