
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your starting bank balance.");
        double balance = input.nextDouble();
        System.out.println("Please enter the interest rate.");
        double rate  = input.nextDouble();
        double doubled = balance;
        int year = 0;
        int myear = 0;
        
        while(doubled <= balance*2)
        {
            doubled = (1 + rate)*balance;
            year++;
            
        }
        System.out.println("The balance will be doubled in " + year + " years");
        
        while(balance < 1000000)
        {
            balance = (1 + rate)*balance;
            myear++;
            
        }
        System.out.println("The balance will reach $1,000,000 in " + myear + " years");
    }
}
