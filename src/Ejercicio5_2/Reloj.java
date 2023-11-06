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
public class Reloj {

    
    private int horas;
    private int minutos;
    private int segundos;

    //Constructores
    public Reloj() {
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
    }

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Reloj(int segundos) {
        this.segundos = segundos;
    }
    
    //Getters
    public int getHoras() {
        return horas;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    //Setters
    public void setHoras(int horas) {
        if(horas>=0 && horas<=23){
            this.horas = horas;
        }
    }


    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<=59){
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if(segundos>=0 && segundos<=59){
            this.segundos = segundos;
        }
        
    }
    
    //otros metodos
    public void ponerEnHora(int segundos){
        
    }
    
    public void tick(){
        if(segundos<60){
            segundos++;
        }else{
            segundos=segundos-60;
            if(minutos<60){
                minutos++;
            }else{
                minutos= minutos-60;
                
                if(horas<24){
                    horas++;
                }else{
                    horas=horas-24;
                }
            }
        }
    }
    
}
