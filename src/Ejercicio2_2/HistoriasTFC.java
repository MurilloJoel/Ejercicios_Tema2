/*
 * Ejercicio 2

Escribe una clase TFC que represente a un Trabajo Fin de Ciclo. La clase tendrá los datos de la persona que lo creó (nombre, apellido1 y apellido2),
el nombre del trabajo, la fecha de creación y un resumen o abstract del trabajo.

La clase tiene dos constructores:

    Constructor de tres parámetros correspondiente a los datos de la persona. El resto de datos del trabajo serán valores nulos.
    Constructor de 6 parámetros que inicializa todos los parámetros.

La clase contiene los siguientes métodos:

Todos los getter y setter.

    getNombrePersona: no recibe parámetros y devuelve el valor del atributo correspondiente al nombre de la persona.
    getApellido1: no recibe parámetros y devuelve el valor del atributo correspondiente al apellido 1.
    getApellido2: no recibe parámetros y devuelve el valor del atributo correspondiente al apellido 2.
    getNombreTrabajo: no recibe parámetros y devuelve el valor del atributo correspondiente al nombre del trabajo.
    getFechaCreacion: no recibe parámetros y devuelve el valor del atributo correspondiente a la fecha de creación.
    getResumen: no recibe parámetros y devuelve el valor del atributo correspondiente al resumen o abstract.
    setNombrePersona: recibe un parámetro con un nuevo valor de nombre de persona para actualizar el atributo correspondiente y no devuelve nada.
    setApellido1: recibe un parámetro con un nuevo valor de apellido 1 para actualizar el atributo correspondiente y no devuelve nada.
    setApellido2: recibe un parámetro con un nuevo valor de apellido 2 para actualizar el atributo correspondiente y no devuelve nada.
    setNombreTrabajo: recibe un parámetro con un nuevo valor de nombre de trabajo para actualizar el atributo correspondiente y no devuelve nada.
    setFechaCreacion: recibe un parámetro con un nuevo valor de fecha de creación para actualizar el atributo correspondiente y no devuelve nada.
    setResumen: recibe un parámetro con un nuevo valor de resumen para actualizar el atributo correspondiente y no devuelve nada.

Además tendrá estos otros métodos:

    inicialesAutor: no recibirá nada y devolverá una cadena de caracteres con la primera letra del nombre y de sus apellidos, todo en mayúsculas.

    autorEnLetrasCapitales: no recibirá ningún argumento y devolverá una cadena de caracteres con el nombre y los dos apellidos a continuación, 
    empezando cada uno de ellos la primera letra en Mayúscula y el resto en minúsculas y separados por espacios. Por ejemplo: Ana Santos Barrio.

    numeroPalabras: no recibirá nada y devolverá un entero que representará el número de palabras que tiene el resumen.

    ocurrenciasDeLetra: recibirá un argumento char correspondiente a una letra y devolverá el número de veces que aparece esa letra en el resumen. 
    Si no aparece ninguna vez, devolverá cero.

Escribe una clase controladora de nombre HistoriasTFC que cree un trabajo fin de ciclo, y después visualice los resultados de todos los métodos que no son getter/setter.
 */
package Ejercicio2_2;

/**
 *
 * @author joel
 */
import java.time.*;
public class HistoriasTFC {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
       TFC t1 = new TFC("Joel","Murillo", "Masa", "Programacion",LocalDate.of(2023,11,06) , "programacion java TFC");
      
        System.out.println(t1.autorEnLetrasCapitales());
        System.out.println(t1.inicialesAutor());
        
        System.out.println(t1.numeroPalabras());
        System.out.println(t1.ocurrenciasDeLetra('a'));
       
       ;
       ;
       
    }
    
}
