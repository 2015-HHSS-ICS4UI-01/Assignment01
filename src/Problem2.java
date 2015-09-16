
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int [] numbers = new int [3];
       for (int i = 0; i <numbers.length; i++)
       {
           numbers [i] = input.nextInt();
       }
       
       int product = numbers[0] *numbers[1] * numbers[2];
        System.out.println("The product of the numbers is " + product);
        
       int square = (int) Math.pow(product, 2);
        System.out.println("The square of the product is " + square);
       
        double squareroot = (double) Math.sqrt(product);
        System.out.println("The square root of the product is " + squareroot);
       
    }
}
