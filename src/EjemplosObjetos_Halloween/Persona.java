/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosObjetos_Halloween;

/**
 *
 * @author Joel
 */
public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private int altura;
    
    //constructor
    public Persona(String nombre, int edad, int altura){
        this.nombre= nombre;
        this.edad=edad;
        this.altura=altura;
    }
    
    // getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getAltura() {
        return altura;
    }
    
    // setters
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = Math.abs(edad);
    }

    

    public void setAltura(int altura) {
        this.altura = Math.abs(altura);
    }
    
    
}
