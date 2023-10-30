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
public class Gato {
    
    //atributos
    private boolean vigilia;
    private String nombre;
    
    //constructor
    public Gato (String nombre){
        this.vigilia=true;
        this.nombre=nombre;
    }
    
    //metodos
    
    public void maulla(Persona p){
        System.out.println("¡MIAU!");
        p.oyeMaullido(this);
    }
    
    public void recibeZapato(){
        System.out.println("¡Clonk!");
        this.vigilia=false;
    }
}
