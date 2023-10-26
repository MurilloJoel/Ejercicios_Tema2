/*
 * CONTROLADORA
 */
package Ejercicio1;

/**
 *
 * @author joel
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       SavingsAccount sa001= new SavingsAccount();
       sa001.balance= 1000;
       sa001.name="Damien";
       sa001.interestRate=0.02;
       sa001.displayCustomer();
       
       SavingsAccount sa002= new SavingsAccount();
       sa002.balance=2000;
       sa002.name="Bill";
       sa002.displayCustomer();
    }
    
}
