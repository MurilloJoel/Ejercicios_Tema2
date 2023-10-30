/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author joel
 */
public class Persona {
    
    //atributos
    boolean vigilia;
    String nombre;
    
    //constructor
    public Persona(String nombre){
        this.vigilia= false;
        this.nombre= nombre;
    }
    
    //metodos
    public void oyeMaullido(Gato g){
        this.vigilia=true;  //se despierta
        System.out.println("¡Toma Zapato!");
        g.recibeZapato();
        this.vigilia=false;
        
        
        
        
    }
}
