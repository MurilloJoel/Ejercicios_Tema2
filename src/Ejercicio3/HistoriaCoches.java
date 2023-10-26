/*
 * version alternativa
 */
package Ejercicio3;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class HistoriaCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        //Objeto c1
        
        Coche c1= new Coche();
        //atributos de c1
        c1.cilindrada=4;
        c1.marca="Hyundai";
        c1.modelo="Tucson";
        c1.color="azul";
        c1.velocidadIni=0;
        
        //metodos de c1
        c1.encender(true);
        System.out.println("El coche c1 esta ahora encendido.");
        
        System.out.print("¿Cuanto quieres acelerar el coche c1?: ");
        c1.acelerar(teclado.nextInt());
        
        System.out.println("Llevas una velocidad de: "+c1.velocidadIni);
        
        System.out.println(c1.imprimirModeloYMarca());
        
        System.out.println("¿Cuanto quieres frenar el coche c1?: ");
        c1.frenar(teclado.nextInt());
        
        System.out.println("Llevas una velocidad de: "+c1.velocidadIni);
        //Objeto c2
        
        Coche c2= new Coche();
        //atributos de c2
        c2.cilindrada=4;
        c2.marca="Seat";
        c2.modelo="Leon";
        c2.color="rojo";
        c2.velocidadIni=0;
        
        
        //metodos de c2
        c2.encender(true);
        System.out.println("El coche c2 esta ahora encendido.");
        
        System.out.print("¿Cuanto quieres acelerar el coche c2?: ");
        c2.acelerar(teclado.nextInt());
        
        System.out.println("Llevas una velocidad de: "+c2.velocidadIni);
        
        System.out.println(c2.imprimirModeloYMarca());
        
        System.out.print("¿Cuanto quieres frenar el coche c2?: ");
        c2.frenar(teclado.nextInt());
        
        System.out.println("Llevas una velocidad de: "+c2.velocidadIni);
        
    }
    
}
