
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter three numbers: ");
        
        
        double[] nums = new double[3];
        
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextDouble();
        }
       
        
        double product = nums[0]*nums[1]*nums[2];
        System.out.println("The product of the three numbers is: " + product);
        
        double square = Math.pow(product, 2);
        System.out.println("The square of the product is: " + square);
        
        double root = Math.sqrt(product);
        System.out.printf("The square root of the product is: %.2f \n ", root);
        
        
        
    }
}
