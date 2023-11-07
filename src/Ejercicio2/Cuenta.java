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
    public Cuenta(int cuenta, double inicial){
        this.numCuenta=cuenta;
        this.saldo=inicial;
    }
    
    //metodos
    public double saldo(){
        return this.saldo;
    }
    
    public void depositar(double cantidad){
        this.saldo+=cantidad;
    }
    public void retirar(double cantidad){
        this.saldo-=cantidad;
    }
    
   /*  PRIMERA MANERA DEL EJERCICIO 6
    * operando con los atributos    
    */
    
    public void transferencia1 (Cuenta c2, double valor){
        if(this.saldo >= valor ){
            this.saldo -= valor;
            c2.saldo += valor;
        }
    }
    
    /*  SEGUNDA MANERA DEL EJERCICIO 6
    * operando con los metodos retirar y depositar    
    */
    
    public void transferencia2 (Cuenta c2, double valor){
        if(this.saldo >= valor ){
            this.retirar(valor);
            c2.depositar(valor);
        }
    }
    
    @Override
    public String toString(){
        return ("La cuenta "+this.numCuenta + " tiene un saldo de: "+ this.saldo+ " €");
    }
}
