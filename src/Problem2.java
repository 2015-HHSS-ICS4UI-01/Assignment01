
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[3];  //initializes numbers as an array
        
        System.out.println("Please enter 3 numbers.");  //asks the user to input three numbers
        
        for(int i = 0; i < 3; i++)                      //loop runs until completed 3 times
        {
            System.out.println("Number " + (i + 1) + ":");    //asks the user for each individual number
            numbers[i] = input.nextInt();               //to store in the array numbers
        }
        
        double product = numbers[0] * numbers[1] * numbers[2]; //calculates the product of the three numbers
        double root = Math.sqrt(product); //calculates the square root of the product
        double square = Math.pow(product,2); //calculates the square of the product
        
        
        System.out.println("Product: " + product);
        System.out.println("Square Root of Product: " + root);
        System.out.println("Product Squared: " + square);
        
    }
    
}
