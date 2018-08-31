/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3adaboletin3;
// Importo el paquete java.util para poder utilizar la clase Scanner
import java.util.*;

/**
 *
 * @author Amarico
 */
public class Ejercicio3AdaBoletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //  Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
        
        // Creo una variable de tipo entero llamada tabla
        
        int tabla;
        
        // empiezo el bucle
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                tabla = i * j;
                Creo una variable de tipo entero llamada tabla
                System.out.println("\nEl resultado de multiplicar " + i + " * " + j + " es: " + tabla);
                
            }
            
        }
        
        
    }
    
}
