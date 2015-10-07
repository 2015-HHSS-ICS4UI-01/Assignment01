
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and initial amount of the account.");
        
        double accbalance = input.nextInt();
        System.out.println("Input the interest rate applied to the account.");
        
        double r = input.nextDouble();
        double doubled = accbalance * 2;
        
        int count = 0;
        int count1 = 0;
            while (accbalance < doubled) {
                count++;
                accbalance = (1 + r) * accbalance;
            }
            System.out.println("The balance will double in " + count + " years.");
            while (accbalance < 1000000) {
            count1++;
            accbalance = (1 + r) * accbalance;
        }   
        System.out.println("The balance will reach $10000000.00 in " + count1 + " years.");
        
        
    }
}
