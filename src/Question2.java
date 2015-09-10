
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] array = new int[3];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }
        
        int product = array[0]*array[1]*array[2];
        
        System.out.println("the product of the numbers is: " + product);
        
        
        int square = (int) Math.pow(product, 2);
        System.out.println("The square of the product is: " + square);
        
        int squareRoot = (int) Math.sqrt(product);
        System.out.println("the square root of the product is: " + squareRoot);
        
        
    }
}
