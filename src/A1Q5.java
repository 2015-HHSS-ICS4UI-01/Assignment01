
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner

        System.out.println("Please enter a number between 1 and 10");   // asking for user to input the number of asterisks they want
        int ask = input.nextInt();  // user inputs the number

        for (int i = 0; i < ask; i++) { // for loop - do the following 

            for (int i2 = 0; i2 < ask; i2++) {  // another for loop - di the following   

                System.out.print("*");  // outputting the asterisks 
            }

            System.out.println(""); // a blank output to put the asterisks on different lines

        }
    }
}
