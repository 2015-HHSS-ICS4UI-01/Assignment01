
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);
        
        //initializes numbers to be inputed as an array
        double[] numbers = new double[3];  
        
        //asks the user to input three numbers
        System.out.println("Please enter 3 numbers.");  
        
        //loop runs until 3 numbers are entered
        for(int i = 0; i < 3; i++)                      
        {
            //asks the user for each individual number
            System.out.println("Number " + (i + 1) + ":");    
            //to store in the array
            numbers[i] = input.nextInt();               
        }
        
        //calculates the product of the three numbers
        double product = numbers[0] * numbers[1] * numbers[2];
        //calculates the square root of the product
        double root = Math.sqrt(product); 
        //calculates the square of the product
        double square = Math.pow(product,2); 
        
        //outputs the product of all three numbers to the user
        System.out.println("Product: " + product);
        //outputs the square root of the product to the user
        System.out.println("Square Root of Product: " + root);
        //outputs the square of the product to the user
        System.out.println("Product Squared: " + square);
        
    }
    
}
