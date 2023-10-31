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
        return this.valor>numero;
    }
    public boolean menor(int numero){    
        return this.valor<numero;
    }
    
    public boolean igual(int numero){
        return this.valor==numero;
    }
}
