/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.excepciones;

/**
 *
 * @author vacax
 */
public class MatriculaNoPermitidaExcepcion extends Exception{

    public MatriculaNoPermitidaExcepcion() {
    }
    
    public MatriculaNoPermitidaExcepcion(String mensaje){
        super(mensaje);
    }
    
    //incluir cualquier cosa...
}
