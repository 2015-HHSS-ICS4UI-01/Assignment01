
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // creating the scanner  
        
        double[] numbers = new double[3];   // creating the array to store the numbers
        
        for(int i = 0; i < numbers.length; i++){    // for loop - do the following 
            System.out.println("Please enter number " + (i + 1) + "."); // asking to input the numbers 
            numbers[i] = input.nextDouble();    // inputting the three numbers 
        }   
        
        double prodT = (numbers[0] * numbers[1] * numbers[2]);  // the product formula
        double sqT = Math.sqrt(prodT);  // finding the square root of the product
        double powT = Math.pow(prodT, 2);   // getting the product squared  
        
        System.out.println("The total product of the three numbers is " + prodT + ", the square root of the product is " + sqT + " and the product squared is " + powT + "!"); // outputting the results 
        
    }
}
