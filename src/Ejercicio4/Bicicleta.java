/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author joel
 */
public class Bicicleta {
    private int numPlatos= 3;
    private int numPiñones= 11;
    private double velocidadActual;
    private int platoActual= 0;
    private int piñonActual= 0;
    
    
    
    //constructor
    
    public Bicicleta(double velocidadActual, int platoActual, int piñonActual){
        this.numPlatos= 3;  //valor por defecto
        this.numPiñones= 11;    //valor por defecto 
        setVelocidadActual(velocidadActual);
        setPlatoActual(platoActual);
        setPiñonActual(piñonActual);
    }
    
    
    
    //metodos
    
    public void acelerar(){
        velocidadActual*=2;
    }
    
    public void frenar(){
        
        if(velocidadActual< 1){
            velocidadActual=0;
        }
        
        velocidadActual/=2;
    }
    
    public void cambiarPlato(int plato){
        setPlatoActual(plato);
    }
    
    public void cambiarPiñon(int piñon){
        setPiñonActual(piñon);
    }
    
    public void ponerEnMarcha(){
        velocidadActual=1;
    }
    
    @Override
    public String toString(){
        return "Bicicleta"
                + "\n-Numero Platos= "+ numPlatos
                + "\n-Numero Piñones= "+ numPiñones
                + "\n-Velocidad Actual= "+ velocidadActual
                + "\n-Plato Actual= "+ platoActual
                + "\n-Piñon Actual= "+ piñonActual;
                
    }
    
    
    
    //Metodos Getter-Setter
    
    
    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        if(numPlatos>0){
            this.numPlatos = numPlatos;
        }
    }

    public int getNumPiñones() {
        return numPiñones;
    }

    public void setNumPiñones(int numPiñones) {
        if(numPiñones>0){
            this.numPiñones = numPiñones;
        }
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidad) {
        if(velocidad>=0){
            this.velocidadActual = velocidad;
        }
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int plato) {
        if(plato>0 && plato<=numPlatos){
            this.platoActual = plato;
        }
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñon) {
        if(piñon>0 && piñon<=numPiñones){
            this.piñonActual = piñon;
        }
    }
    
    
}
