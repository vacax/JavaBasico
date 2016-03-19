/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.colecciones;

import edu.pucmm.javabasico.interfases.Ciudadano;
import edu.pucmm.javabasico.interfases.Trabajador;
import edu.pucmm.javabasico.interfases.paisa.TrabajadorA;
import edu.pucmm.javabasico.objetos.Estudiante;
import edu.pucmm.javabasico.objetos.Profesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author vacax
 */
public class Colecciones {

    public static void main(String[] args) {

        //Arreglo:
        int[] arregloEntero = new int[5];
        arregloEntero[0] = 1;
        arregloEntero[1] = 2;
        for (int i = 0; i < arregloEntero.length; i++) {
            System.out.println("arregloEntero[" + i + "]  = " + arregloEntero[i]);
        }

        //arregloEntero[5] = 10; //Falla, sale de los bloques reservados...
        Object[] arregloObjeto = new Object[5];
        arregloObjeto[0] = new Estudiante(20011136);
        arregloObjeto[1] = new Profesor("Carlos Camacho", "03104281310", new Date());
        arregloObjeto[2] = new Ciudadano();

        for (int i = 0; i < arregloObjeto.length; i++) {
            System.out.println("arregloObjeto[" + i + "]  = " + arregloObjeto[i]);
            Object objeto = arregloObjeto[i];
            if (objeto instanceof Ciudadano) { //si es verdadeo retorna true
                System.out.println("La clase consultada es del tipo: " + objeto.getClass().getName());
            }
        }

        //Colecciones: memoria dinamica... java.util.*
        // List, Hashmap, Set, Vectores, Pila
        //ArrayList que recibe 
        ArrayList lista = new ArrayList();
        lista.add(new Estudiante());
        lista.add(new Ciudadano());
        lista.add(new TrabajadorA());

        //Casting o cambio de de tipo.
        Ciudadano ciudadano = (Ciudadano) lista.get(1);
        System.out.println("El ciudadano: " + ciudadano);

        //Falla por el hecho de no ser tipos compatibles, error en ejecución.
//        TrabajadorA trabajadorA = (TrabajadorA) lista.get(0);
//        trabajadorA.disparar();
        if (lista.get(2) instanceof TrabajadorA) {
            TrabajadorA trabajadorA = (TrabajadorA) lista.get(2);
            trabajadorA.disparar();
        }
        
        ArrayList<Ciudadano> listaCiudadano =new ArrayList<>();
        listaCiudadano.add(new Ciudadano());
        //listaCiudadano.add(new Estudiante()); // validado por el compilador.
        listaCiudadano.add(new TrabajadorA());
        listaCiudadano.add(new Trabajador());
        
        List<Ciudadano> listaCiudadano2 = new ArrayList<>();
        List<Ciudadano> listaCiudadano3 =new LinkedList<>();
        
        //
        recorrerLista(listaCiudadano3);
        recorrerLista(listaCiudadano);
        recorrerLista(listaCiudadano2);
                
                
    }
    
    public static void recorrerLista(List<Ciudadano> lista){
        //TODO: implementar recorrido
    }
}
