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
public class Trato {
    //atributos
    private int golosinas= 0;

    //getter
    public int getSustos() {
        return golosinas;
    }
    
    //setter
    public void setSustos(int golosinas) {
        if(golosinas>0)
            this.golosinas = golosinas;
    }
    
    public void HazmeTrato(Persona p){
    
            //1 golosina por cada letra del nombre
            golosinas += p.getNombre().length();
            
            //1 golosina si la edad es múltiplo de 3, pero solo a los que tienes 10 años o menos
            if(p.getEdad()<=10 && p.getEdad()%(p.getEdad()/3)==0){
                golosinas++;
            }
            
            //2 golosinas por cada 50 cm de altura hasta un máximo de 150 cm
            if(p.getAltura()<=150){
                 golosinas+= 2*(p.getAltura()/50);
            }
            
    }

    @Override
    public String toString() {
        return String.valueOf(golosinas);
    }
}
