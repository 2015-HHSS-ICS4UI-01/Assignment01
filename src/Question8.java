
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the initial amount");
        double amount = input.nextDouble();
        System.out.println("Please enter the interest rate");
        double interest = input.nextDouble();
        int year = 0;
        int year1 = 0;
        double initial = amount;
        double initial1 = amount;
        
        
        while (amount < initial*2)
        {
            amount = (1 + interest)*amount;
            year++;
        }
        
        System.out.println("It will take " + year + " years for the money to double");
        System.out.println("");
        
        while (initial1 < 1000000)
        {
            initial1 = (1 + interest)*initial1;
            year1++;
        }
        System.out.println("It will take " + year1 + " years for the money to reach 1 million");
        
        
        
    }
    
}
