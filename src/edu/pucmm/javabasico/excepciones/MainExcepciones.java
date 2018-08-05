/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.javabasico.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vacax
 */
public class MainExcepciones {

    public static void main(String[] args) {
        int dividendo = 2;
        int divisor = 0;  //
        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("No puede ser cero el divisor...");
        }
        
        //Abriendo un archivo por la red o en un disco duro USB...
        File archivo = new File("/home/vacax/UnArchivoQueNoExiste");
        try {
            RandomAccessFile randomAccessFile =new RandomAccessFile(archivo, "r");
            //Si no existe error continua...
            System.out.println("La cantidad bytes archivo: "+randomAccessFile.length());
        } catch (FileNotFoundException ex) {
            //Si tengo un error entre en este bloque...
            System.out.println("Entro al bloque de archivo no encontrado...");
            Logger.getLogger(MainExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex){
            ex.printStackTrace();
        } finally{
            //se ejecuta siempre al final del bloque try o catch.
            System.out.println("Existe o no problema siempre entra - Bloque Finally");
        }
        
        //validarInformacion("1323123");
        try {
            validarInformacion("213123");
            validarInformacion("20011136"); // genera una excepcion.
        } catch (MatriculaNoPermitidaExcepcion ex) {
            Logger.getLogger(MainExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * metodo para validar una matricula que genera una excepción.
     * @param matricula
     * @throws MatriculaNoPermitidaExcepcion 
     */
    public  static void validarInformacion(String matricula) throws MatriculaNoPermitidaExcepcion{
        if(!matricula.equals("20011136")){
            //throw disparamos una excepción mia o de de otros.
            throw new MatriculaNoPermitidaExcepcion("La matricula enviada "+matricula+", no es valida.");
        }
    }
}
