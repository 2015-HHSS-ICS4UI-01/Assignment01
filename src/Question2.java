
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Nums = new int[3];
        System.out.println("Please enter 3 integers");
        for(int i = 0; i <Nums.length; i++){
            
            Nums[i] = input.nextInt();
        }
        int product = (Nums[0]*Nums[1]*Nums[2]);
        System.out.println("The product of those numbers is " + product);
        
        int square = (int)(Math.pow(product, 2));
        System.out.println("The product squared is " + square);
        
        double root = (double) (Math.sqrt(product));
        System.out.println("The square root of th product is " + root);
    }
}
