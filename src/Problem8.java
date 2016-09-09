
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
        
        //ask user for initial money in bank account
        System.out.println("Please enter the initial amount of money in bank account:");
        double initial = input.nextDouble();
        
        //ask user for interest rate
        System.out.println("Now please enter the interest rate:");
        double interest = input.nextDouble();
        
        while(initial<(initial*2)){
            double timestwo = (1+interest)*initial;
            initial = timestwo;
            if(initial==(initial*2)){
                break;
            }
        }
        System.out.println("Your money will double in "+initial+" years.");        
    }
}
