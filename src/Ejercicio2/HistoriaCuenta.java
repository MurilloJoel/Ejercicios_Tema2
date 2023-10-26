/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author joel
 */
public class HistoriaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1= new Cuenta(1,100);
        
        //inicial
        System.out.println("Inicial: " + c1.toString());
        
        //despues de depositar los 50 euros
        c1.depositar(50);
        System.out.println(c1.toString());
        
        //despues de retirar 25 euros
        c1.retirar(25);
        System.out.println(c1.toString());
        
        Cuenta c2= new Cuenta(2,c1.saldo);
        System.out.println(c2.toString());
        
    }
    
}
