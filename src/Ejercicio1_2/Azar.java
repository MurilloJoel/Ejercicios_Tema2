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

public class Azar {
    private int valor;
    
    //constructor
    public Azar(){
        this.valor= (int)(Math.random()*100 + 1);
    }
    
    //metodos
    public boolean mayor(int numero){
        boolean mayor=false;
        if(numero>this.valor){
            mayor=true;
        }
        return mayor;
    }
    public boolean menor(int numero){
        boolean menor=false;
        if(numero<this.valor){
            menor=true;
        }
        return menor;
    }
    
    public boolean igual(int numero){
        boolean igual=false;
        if(numero==this.valor){
            igual=true;
        }
        return igual;
    }
}
