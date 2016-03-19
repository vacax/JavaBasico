/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.herencia;
import edu.pucmm.javabasico.objetos.Profesor;
import java.util.Date;

/**
 *
 * @author vacax
 */
public class Humano extends Mamifero{
    
    public final static int CONSTANTE = 1; //constate de tipo primitivo
    public final static Profesor PROFESOR = new Profesor(); //constate de tipo objeto
    
    String apellido;
    Date fechaNacimiento;
    String tipoSangre;
    
    public Humano(String nombre){
        this.nombre = nombre;
    }
     
    
    public void trabajar(){
        
    }
    
    public void estudiar(){
        
    }

    /**
     * Concepto de sobre escribir..
     */
    @Override
    public void nacer() {
        System.out.println("====== Humano Naciendo =====");
        super.nacer(); //Llamando el metodo del padre... es opcional...
        System.out.println("El humano se llama: "+nombre);        
        System.out.println("====== FIN Humano Naciendo =====");
    }

    //Da error, dado que el metodo está marcado como  final...
//    @Override
//    public void metodoQueNoPermiteLaSobreEscritura() {
//        super.metodoQueNoPermiteLaSobreEscritura(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
    
}
