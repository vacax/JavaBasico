/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author vacax
 */
public class BuscarColecciones {

    public static void main(String[] args) {
        //recupero la lista de las personas:
        List<Persona> listaPersonas = getListaPersonas();
        System.out.println("La cantidad de elementos: " + listaPersonas.size());

        int posicion = getPosicionNombre(listaPersonas, "Jorge Camacho");
        System.out.println("La persona :" + listaPersonas.get(posicion).getNombre() + ", se encuentra en la posicion: " + posicion);

        System.out.println("El Id de Laura Camacho es: " + getIdPorNombreStream(listaPersonas, "Laura Camacho"));
        
        Persona p1 = listaPersonas.get(0); //recuperando la posicion 0.
        Persona p2 = new Persona(2, "Edgar Camacho"); //instancia nueva.
        
        //buscar la posicion del objeto persona 1.
        System.out.println("La posicion del objeto persona Carlos Camacho: "+listaPersonas.indexOf(p1));
        // no lo encuentra porque es otra instancia, aunque los datos sean los mismos. 
        // El comportamiento estandar por la forma de busqueda, es por el hash.
        // Si quiero buscar por los datos y no por la instancia, debo sobreescribir el metodo equals
        System.out.println("La posicion del objeto persona Edgar Camacho: "+listaPersonas.indexOf(p2)); 
        
    }

    /**
     *
     * @return
     */
    public static List<Persona> getListaPersonas() {
        // La lista, permite valores repitidos. utilizar Set de lo contrario.
        List<Persona> lista = new ArrayList<>();
        // puede ser completada del teclado...
        lista.add(new Persona(1, "Carlos Camacho"));
        lista.add(new Persona(2, "Edgar Camacho"));
        lista.add(new Persona(3, "Jorge Camacho"));
        lista.add(new Persona(4, "Laura Camacho"));
        //retorno.
        return lista;
    }

    /**
     *
     * @param lista
     * @param nombre
     * @return retorna -1, si no encuentra el nombre. (Es mejor por excepción).
     */
    public static int getPosicionNombre(List<Persona> lista, String nombre) {
        int posicion = -1; // si no existe retorna -1
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) { // no se puede hacer == en String, si quiero comparar el contenido.
                return posicion = i;
            }
        }
        return posicion;
    }

    /**
     * Utilizando la programación funcional
     *
     * @param lista
     * @param nombre
     * @return
     */
    public static int getIdPorNombreStream(List<Persona> lista, String nombre) {
        int posicion = -1; // si no existe retorna -1
        Optional<Persona> filter = lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).findFirst();
        return filter.get().getId();
    }

}

/**
 * Clase utilizada para el ejemplo de busqueda.
 *
 * @author vacax
 */
class Persona {

    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    /**
     * Sobre-escribiendo el metodo para evaluar la igualdad por los
     * parametros y no por la referencia del objeto (memoria)
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Persona){
            Persona temp = (Persona) obj;
            return id == temp.getId() && nombre.equalsIgnoreCase(temp.getNombre());
        }
        return false;
    }
    
    

}
