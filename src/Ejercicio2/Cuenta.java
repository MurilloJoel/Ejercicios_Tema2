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
public class Cuenta {
    //atributos
    double saldo;
    int numCuenta;
    
    //constructor
    Cuenta(int cuenta, double inicial){
        this.numCuenta=cuenta;
        this.saldo=inicial;
    }
    
    //metodos
    double saldo(){
        return this.saldo;
    }
    
    void depositar(double cantidad){
        this.saldo+=cantidad;
    }
    void retirar(double cantidad){
        this.saldo-=cantidad;
    }
    @Override
    public String toString(){
        return ("La cuenta "+this.numCuenta + " tiene un saldo de: "+ this.saldo+ " €");
    }
}
