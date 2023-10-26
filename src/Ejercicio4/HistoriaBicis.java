/*
 * version alternativa
 */
package Ejercicio4;

/**
 *
 * @author joel
 */


public class HistoriaBicis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /*------------------ OBJETO miBicicleta -------------------------------*/
        
        Bicicleta miBicicleta= new Bicicleta(1,3,2);
        
        if(miBicicleta.getVelocidadActual()==0){                //
            miBicicleta.ponerEnMarcha();                        // Esta instruccion es para que cuando la velocidad actual sea 0:
            System.out.println("MiBicicleta esta encendida");   //Invoca al metodo ponerEnMarcha() para que la velocidadActual sea 1;
        }                                                       //
        
        miBicicleta.acelerar();
        System.out.println("Mibicicleta: acelerada "+ miBicicleta.getVelocidadActual());
        
        miBicicleta.frenar();
        System.out.println("Mibicicleta: frenada "+ miBicicleta.getVelocidadActual());
        
        miBicicleta.cambiarPiñon(3);
        System.out.println("Mibicicleta: piñon "+ miBicicleta.getPiñonActual());
        
        miBicicleta.cambiarPlato(2);
        System.out.println("Mibicicleta: plato "+ miBicicleta.getPlatoActual());
        
        
        System.out.println("---------------------------------------------------");
        
        /*------------------ OBJETO tuBicicleta -------------------------------*/
        
        Bicicleta tuBicicleta= new Bicicleta(0,1,1);
        
        
        if(tuBicicleta.getVelocidadActual()==0){                //
            System.out.println("TuBicicleta esta encendida");   // Esta instruccion es para que cuando la velocidad actual sea 0:
            tuBicicleta.ponerEnMarcha();                        //Invoca al metodo ponerEnMarcha() para que la velocidadActual sea 1;
        }                                                       //
        
        tuBicicleta.acelerar();
        System.out.println("TuBicicleta: acelerada " + tuBicicleta.getVelocidadActual());
        
        tuBicicleta.frenar();
        System.out.println("Tubicicleta: frenada "+ tuBicicleta.getVelocidadActual());

        tuBicicleta.cambiarPiñon(2);
        System.out.println("Tubicicleta: piñon "+ tuBicicleta.getPiñonActual());
        
        tuBicicleta.cambiarPlato(3);
        System.out.println("Tubicicleta: plato "+ tuBicicleta.getPlatoActual());
        
        
    }
    
}
