/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6_2;

/**
 *
 * @author joel
 */
import Ejercicio2.Cuenta;
public class HistoriaCuentas2 {
    
    public static void main(String[] args) {
        Cuenta c1= new Cuenta(1, 200);
        Cuenta c2= new Cuenta(2, 300);
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("                                Estado original cuentas");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("----------------------------------------------------------------------------------------------");
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("                                Estado modificado cuentas");
        c1.transferencia1(c2, 100);
        System.out.println("%n Las cuentas despues de transeferir por el primer metodo"+ c1.toString() + c2.toString());
        System.out.println("----------------------------------------------------------------------------------------------");
    }
    
}
