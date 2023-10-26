/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosObjetos.Halloween;

/**
 *
 * @author developer
 */
public class Truco {
    //atributos
    private int sustos= 0;

    //getter
    public int getSustos() {
        return sustos;
    }
    
    //setter
    public void setSustos(int sustos) {
        if(sustos>0)
            this.sustos = sustos;
    }
    
    //otros metodos
    public void HazmeTruco(Persona p){
    
            //1 susto por cada 2 letras del nombre de la persona
            sustos += p.getNombre().length() / 2;
            
            //2 sustos si la edad es par
            if(p.getEdad() % 2 == 0 ){
                sustos+= 2;
            }
            
            //3 sustos si supera los 100 cm de altura
            if(p.getAltura() > 100){
                sustos+= 3;
            }
            
    }

    @Override
    public String toString() {
        return String.valueOf(sustos);
    }
    
    
    
}
