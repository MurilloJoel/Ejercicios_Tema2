/*
 * Ejercicio 5

Escribir una clase llamada Reloj que mide el  tiempo:

La clase tiene tres atributos enteros positivos: horas, minutos (0..59) y segundos (0..59).

La clase tiene tres constructores:

    Constructor de tres parámetros.
    Constructor de 0 parámetros (se inicializa el objeto a 0 horas, 0 minutos y 0 segundos, es decir a t0)
    Constructor de un parámetro que indica los segundos en bruto. Habrá que calcular las horas, los minutos y los segundos.

La clase contiene los siguientes métodos:

    ponerEnHora() recibe como parámetro un número de segundos que será convertido a horas, minutos y segundos
    getHoras() no recibe parámetros y devuelve el valor del atributo horas
    getMinutos()no recibe parámetros y devuelve el valor del atributo minutos
    getSegundos()no recibe parámetros y devuelve el valor del atributo segundos
    setHoras() recibe como parámetro  un  valor y se lo asigna al atributo horas
    setMinutos() recibe como parámetro  un  valor y se lo asigna al atributo minutos
    setSegundos() recibe como parámetro  un  valor y se lo asigna al atributo segundos
    tick() no recibe parámetros y suma un segundo a la hora del reloj
    toString() devuelve la información del objeto

Desde el método main de la clase controladora, que cree tres relojes, uno con cada constructor. 
Crea una historia con los métodos programados, a tu gusto.
 */
package Ejercicio5_2;

/**
 *
 * @author developer
 */
public class HistoriaReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj r1= new Reloj();      //Reloj por defecto
        Reloj r2= new Reloj(18,13,20);      //Reloj definido
        Reloj r3= new Reloj(7199);      //Reloj iniciado mediante unos segundos
        
        
        System.out.println("----------------------------------------------------------------------------");
        
        System.out.println("El primer reloj (por defecto) ---> "+ r1.toString());
        System.out.println("El segundo reloj (definido) ---> "+ r2.toString());
        System.out.println("El tercer reloj (mediante un valor de los segundos) ---> "+ r3.toString());
        
        System.out.println("------------------------------------------------------------------------------");
        
        r2.tick();
        System.out.println("El segundo de los relojes despues de un tick ---> "+ r2.toString());
        
        r3.tick();
        System.out.println("El tercero de los relojes despues de un tick ---> "+ r3.toString());
        
    }
    
}
