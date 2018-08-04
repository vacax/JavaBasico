/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.main;

import edu.pucmm.javabasico.abstractras.FiguraGeometrica;
import edu.pucmm.javabasico.objetos.Asignatura;
import edu.pucmm.javabasico.objetos.Estudiante;
import java.math.BigDecimal;

/**
 *
 * @author vacax
 */
public class Main {
    
    String propiedadDeInstancia = ""; //es una propiedad de instancia...
    static String propiedadDeClase = ""; // propiedad de clase...
    
    public static void main(String[] args) { // el metodo es de clase:
        //propiedadDeInstancia = "Asignando información..."; //error por la el contexto estatico.
        ///
        Estudiante estudiante = new Estudiante(); // instancia.
        //acceso a las propiedades.
        estudiante.nombre = "Carlos Camacho";
        
        Estudiante estudiante2;
        //estudiante2.nombre = "Otro Estudiante"; //error es de instancia y no he declaradp.
        
        Estudiante estudiante3 = new Estudiante(20011136, "Carlos Camacho");
        System.out.println("El estudiante3 matricula: "+estudiante3.nombre);
        
        Asignatura asignatura =new Asignatura();
        
        //
        FiguraGeometrica circulo = new FiguraGeometrica() { //instanciando una clase abstracta.
            public int radio = 20;
            @Override
            public BigDecimal area() { //tengo que darle respuesta a los metodos abstractos.
                return new BigDecimal((radio * radio )* Math.PI);
            }

            @Override
            public BigDecimal perimetro() {
                return null;
            }
        };
        
        System.out.println("El radio del circulo: "+circulo.area()); 
        
    }
    
    public void otroMetodo(){ //instancia...
        propiedadDeClase = "Asignando la información en la propiedad de Clase";
    }
}
