/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.objetos;

/**
 * Ejemplo de clase POJO
 * todas sus propiedades son privadas y el acceso a ellas son mediantes metodos
 * set y get y debe tener un constructor vacio.
 * @author vacax
 */
public class Asignatura {
    private String nombre;
    private String clave;

    /**
     * @return the nombre
     */
    public String getNombre() {
        
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
