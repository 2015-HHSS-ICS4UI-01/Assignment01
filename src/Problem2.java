
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murra9546
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //create new array
        int[] nums = new int[3];
        
        for(int i = 0; i < nums.length; i++)
        {
            //ask user to input 3 numbers
            System.out.println("Please enter 3 number");
            //place number in array
            nums[i] = input.nextInt();
        }
        
        //declare product as 0
        int product = 0;
        //multiply the 3 numbers
        product = nums[0]*nums[1]*nums[2];
        //output product
        System.out.println("The product is: " + product);
        
        //find the square
        double sqr = 0;
        sqr = Math.pow(product,2);
        //output the square
        System.out.println("The square of the product is " + sqr);
        
        //find the squareroot of the product
        double sqroot = 0;
        sqroot = Math.sqrt(product);
        //output the squareroot of the product
        System.out.println("The square root of the product is " + sqroot);
        
        
        
    }
}
