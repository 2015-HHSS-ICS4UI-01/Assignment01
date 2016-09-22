
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert scanner for user input
        Scanner input = new Scanner(System.in);
        
        //count of years
        int years = 0;
        
        //ask user for initial money in bank account
        System.out.println("Please enter the initial amount of money in bank account:");
        double initial = input.nextDouble();
        
        //ask user for interest rate
        System.out.println("Now please enter the interest rate:");
        double interest = input.nextDouble();
        
        //calculate the amount of years the interest will double
        while(initial<(initial*2)){
            initial = (1+interest)*initial;
            years = years +1;
        }
        
        //output how many years interest will double
        if(initial >=(initial*2)){
             System.out.println("Your money will double in "+initial+" years.");  
        }
             
    }
}
