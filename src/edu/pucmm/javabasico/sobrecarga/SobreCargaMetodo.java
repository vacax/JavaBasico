/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.sobrecarga;

/**
 *
 * @author vacax
 */
public class SobreCargaMetodo {
    
    String propiedad;

    public SobreCargaMetodo() {
    }

    public SobreCargaMetodo(String propiedad) {
        this.propiedad = propiedad;
    }
    
    public void sobreCargaMetodo(){
        
    }
    
    public void sobreCargaMetodo(String otroValor){
        
    }
    
    public void sobreCargaMetodo(String valor1, String valor2){
        
    }
    
    public String sobreCargaMetodo(boolean otrodato){
        return null;
    }
    
}
