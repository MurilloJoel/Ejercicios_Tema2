/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author joel
 */
public class Coche {
    String color;
    String marca;
    String modelo;
    int cilindrada;
    int velocidadIni;
    
    
    int velocidadIni(){
        return this.velocidadIni;
    }
    
    
    public void encender(boolean encendido){
        encendido=true;
    }
    
    public void acelerar(int velocidad){
        this.velocidadIni+=velocidad;
    }
    
    public void frenar(int velocidad){
        this.velocidadIni-=velocidad;
    }
    
    public String imprimirModeloYMarca(){
        return ("Estamos ante un "+this.marca + " "+ this.modelo);
    }
    
    
}
