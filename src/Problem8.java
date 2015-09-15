
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter your balance");
        double balance = input.nextDouble();
        double balance2 = balance;
        System.out.println("enter interest charged in decimal");
        double interest = input.nextDouble();
        int count = 1;
        
        for (; balance < balance2*2 ; count++) {
            double interestcharged = balance * interest;
            balance += interestcharged;

        }
            System.out.println(balance);
        System.out.println("Money doubles in "+count);
        
        
       
    }
    
}
