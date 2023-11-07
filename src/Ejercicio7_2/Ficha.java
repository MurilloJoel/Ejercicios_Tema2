/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7_2;

/**
 *
 * @author developer
 */
public class Ficha {

    
    private int posicion;

    //Constructores
    public Ficha(){
        this.posicion= 0;
    }
    
    public Ficha(int numero){
        this.posicion= numero;
    }
    
    
    //otros metodos
    public void avanzar(){
        this.posicion++;
    }
    
    public void retroceder(){
        this.posicion--;
    }
    
    public void saltar(int num){
        this.posicion += num;
    }

    @Override
    public String toString() {
        return "La ficha se encuentra en la posicion: "+ posicion;
    }

    
    //getter y setter
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
