/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author joel
 */

import java.awt.Rectangle;

public class Manipular {
  
    public static void main(String[] args) {

        // Instanciamos el objeto rect indicando posicion y dimensiones
        Rectangle rect = new Rectangle( 50, 50, 150, 150 );

        //Consultamos las coordenadas x e y del rectangulo
        System.out.println( "-------- Coordenadas esquina superior izqda. --------");
        System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);

        // Consultamos las dimensiones (altura y anchura) del rectangulo
        System.out.println( "\n-------------------- Dimensiones --------------------");
        System.out.println("\tAlto = " + rect.height ); 
        System.out.println( "\tAncho = " + rect.width);

        
        //Cambiar coordenadas del rectangulo
        System.out.println( "\n-- Nuevos valores de los atributos --");
        rect.height=100;
        rect.width=100;
        System.out.println("\tAlto = " + rect.height );
        System.out.println( "\tAncho = " + rect.width);
        
        rect.setSize(200, 200);
        System.out.println( "\n-- Nuevos valores de los atributos despues del setSize() --");
        System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);
        System.out.println("\tAlto = " + rect.height );
        System.out.println( "\tAncho = " + rect.width);

    }
}