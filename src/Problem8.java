
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial ammount");
        double initial = input.nextDouble();
        System.out.println("Enter the interest rate");
        double interest = input.nextDouble();
        System.out.println("Enter the ammount of years");
        int years = input.nextInt();
        double balance = initial;
        double power = Math.pow((1+interest),years);
        balance=initial+power;
        System.out.println(balance);        
    }
}
