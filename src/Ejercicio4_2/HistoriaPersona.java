/*
 * Ejercicio 4

Añádele el atributo  el peso (en Kg) a la clase Persona del ejercicio anterior. Añade un método de nombre imc que no reciba ningún parámetro y que devuelva el valor del índice de masa corporal.

Crea una clase controladora en el paquete de nombre Ejercicio4 (en este paquete no habrá más clases que la controladora). 
En esta clase haz una importación de la clase Persona del paquete Ejercicio3. En el método main crea una persona de nombre sujeto 
y muestra por pantalla su índice de masa corporal.

 */
package Ejercicio4_2;

/**
 *
 * @author joel
 */
import Ejercicio3_2.Persona;
public class HistoriaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p= new Persona (168, 71.5);
        
        System.out.println(p.imc());
    }
    
}
