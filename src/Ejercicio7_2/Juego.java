/*
 * 
    Ejercicio 7

    Realiza una clase Ficha que tenga un solo atributo de nombre posicion, que es del tipo entero.

    Tendrá dos constructores:

    Sin parámetros  que empieza en la posición 0
    Con un parámetro que inicie la posición según el argumento recibido
    Métodos:
        avanzar() suma uno a la posición de la ficha.
        retroceder() resta uno a la posición de la ficha.
        saltar(int num) recibe un número de posiciones que se suman a la posición de la ficha.
        toString() que devuelve información del objeto.
    
    Crea una clase controladora de nombre Juego con método main ya haz avanzar la ficha varias veces,
    retroceder y saltar, sacando de cuando en cuando información de por donde va.
 */
package Ejercicio7_2;

/**
 *
 * @author joel
 */
public class Juego {

    public static void main(String[] args) {
       Ficha f1= new Ficha();
       Ficha f2= new Ficha(10);
       
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("                      FICHAS INICIALES");
        
        System.out.println("Ficha 1: " + f1.toString());
        System.out.println("Ficha 2: " + f2.toString());
        
        System.out.println("-------------------------------------------------------------------------");
        
        
        f1.avanzar();
        f2.retroceder();
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("                      FICHAS MODIFICADAS");
        
        System.out.println("Ficha 1 (avanzada): " + f1.toString());
        System.out.println("Ficha 2 (retrocedida): " + f2.toString());
        
        System.out.println("-------------------------------------------------------------------------");
        
        
        
        f2.saltar(5);
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("                      FICHA 2 ASIGNANDOLE UN VALOR");
        
        System.out.println("Ficha 2: " + f2.toString());
        
        System.out.println("-------------------------------------------------------------------------");
    }
    
}
