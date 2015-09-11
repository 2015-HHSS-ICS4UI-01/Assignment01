
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input three numbers to be multiplied together:");
        int[] nums = new int[3];
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        //multiplying
        double product = (nums[0])*(nums[1])*(nums[2]);
        //product
        System.out.println("Answer = " + product);
        //square
        double square = Math.pow(product,2);
        System.out.println("The Square of the Answer is " + square);
        ////square root
        double sqrt = Math.sqrt(product);
        System.out.println("The Square root of the Answer is " + sqrt);
    }
}
