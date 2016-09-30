
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner 

        System.out.println("Please enter the initial balance of the account."); // asking for the initial balance of the account 
        double start = input.nextDouble();  // inputting the amount for the initial balance of the account

        System.out.println("Now please enter the rate of interest.");   // asking for the interest on the account
        double rate = input.nextDouble();   // inputting the amount for the rate 

        double finish = (start * 2);    // the final balance is that starting balance multiplied by 2

        int time = (0); // the integer time is equal to 0

        while (start < finish) {  // while the starting amount is less than the finish do the following 
            start = (1 + rate) * start; // start is equal to the rate + 1 multiplied by the starting amount
            time = time + 1;    // the time goes up by one each time the above is done 
        }

        System.out.println("It will take " + time + " to double your money.");  // outputting the amount of time it will take to double the money 

        while (start < 1000000) { // while the balance of the account is less than one million do the following 
            start = (1 + rate) * start; // the starting amount is equal to the rate + 1 multiplied by the starting amount
            time = time + 1;    // time goes up by one each time the above is done 
        }

        System.out.println("It will take " + time + " years to reach 1 million dollars.");  // outputting the amount of time for the account balance to reach one million dollars 

    }
}
