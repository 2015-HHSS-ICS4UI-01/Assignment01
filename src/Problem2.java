
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nums = new int[3];
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Please enter a number");
            nums[i] = input.nextInt();
        }
        int prod = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            prod = prod * nums[i];
        }
        System.out.println("The product of the numbers are " + prod);
        int square = (int) Math.pow(prod,2);
        int root = (int) Math.sqrt(prod);
        System.out.println("The product squared is " + square);
        System.out.println("The square root of the product is " + root);
    }
}
