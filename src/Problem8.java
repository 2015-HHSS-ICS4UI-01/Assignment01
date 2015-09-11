
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the initial amount.");
        double initial = input.nextDouble();
        System.out.println("Please enter the interest rate.");
        double interest = input.nextDouble();
        double balance = initial;
        int year = 0;
        
        while (balance <= 1000000)
        {
            balance = (1  + interest) * balance;
            
            year ++;
        }
        System.out.println("It will take " + year + " year(s) to reach $1,000,000");
        double balance1 = initial;
        int year1 = 0;
        
        do
        {
            balance1 = (1 + interest) * balance1;
            year1 ++;
        }while (balance1 < initial * 2);
        System.out.println("It will take " + year1 + " year(s) to reach double the initial amount");
    }
}
