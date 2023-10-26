/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosObjetos.Halloween;

/**
 *
 * @author developer
 */

import java.util.Scanner;

public class HistoriaHalloween {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado= new Scanner(System.in);
    
    public static void main(String[] args) {
        Persona victima = leerDatosPersona();
        
        System.out.println("Quieres truco o trato");
        String t = teclado.nextLine();
        
        if(t.equalsIgnoreCase("truco")){
            Truco tru = new Truco();
            tru.HazmeTruco(victima);
            System.out.println(tru.toString()+ " BUUUUUUUHH");
        }else if(t.equalsIgnoreCase("trato")){
            Trato tra= new Trato();
            tra.HazmeTrato(victima);
            System.out.println(tra.toString()+ " DULCES");
        }
    }
    
    public static Persona leerDatosPersona(){
        Persona p;
        System.out.println("¿Cuanto mides?");
        int altura=teclado.nextInt();
        System.out.println("¿Cual es tu edad?");
        int edad=teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("¿Cual es tu nombre?");
        String nombre=teclado.nextLine();
        
        p= new Persona(nombre, edad, altura);
        return p;
        
    }
    
}
