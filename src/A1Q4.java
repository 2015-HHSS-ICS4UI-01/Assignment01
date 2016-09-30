
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner

        System.out.println("Please enter a number between 1 and 10");   // asking for them to input a number between the numbers 1 and 10
        int ask = input.nextInt();  // inputting the integer

        for (int i = 0; i < ask; i++) {   // while i is less then the number inputted, output a asterisks
            System.out.print("*");  // outputting the asterisks
        }
        
        System.out.println(""); // blank output so the asterisks are on different lines 
        
    }
}