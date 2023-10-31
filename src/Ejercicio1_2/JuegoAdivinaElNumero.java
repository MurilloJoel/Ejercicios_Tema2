/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_2;

/**
 *
 * @author joel
 */

import static java.lang.Math.random;
import java.util.Scanner;
public class JuegoAdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int contador=0;
        Azar primerNumero = new Azar();
        
        System.out.println("Dame un numero entre 1-100 (para compararlo con el numero escogido): ");
        int numero= teclado.nextInt();
        System.out.println("¿Es mayor? "+primerNumero.mayor(numero));
        System.out.println("¿Es menor? "+primerNumero.menor(numero));
        System.out.println("¿Es igual? "+primerNumero.igual(numero));
            
        while(primerNumero.igual(numero)== false){
            System.out.println("Intentalo de nuevo: ");
            numero= teclado.nextInt();
            
            if(primerNumero.mayor(numero)){
                System.out.println("El numero es mayor");
            }else if(primerNumero.menor(numero)){
                System.out.println("El numero es menor");
            }
            
            
            contador++;
        }
        System.out.println("Enhorabuena, has adivinado el numero "+ numero+ " y has necesitado un total de " + contador+ " intentos");
    }
    
}
