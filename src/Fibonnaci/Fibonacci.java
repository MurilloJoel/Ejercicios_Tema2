/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonnaci;

/**
 *
 * @author developer
 */
public class Fibonacci {
    
    static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        
        }else{
            return (fibonacci(n-1)+ fibonacci(n-2));
        }    
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }
    
}
