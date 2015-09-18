
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the amount of money:");
        double balance = input.nextDouble();
        
        System.out.println("Please enter the interest rate: ");
        double rate = input.nextDouble()/100.0;
        
        int year = 2014;
        
        double twice = balance*2;
        do
        {
            balance = (1 + rate) * balance;
            year = year + 1 ;
        }while(balance < twice);
        System.out.println("You will double your money by " + year);
        
        
        int year2 = 2014;
        do
        {
            balance = (1 + rate) * balance;
            year2 = year2 +1;
        }while (balance <= 1000000);
        System.out.println("You will have 1 million dollars by " + year2);
    }
}
