/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author valet8115
 */
public class Problem2 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int[] nums = new int[3];
    
    for (int i = 0; i < nums.length; i++) {
        System.out.println("Please enter a number ");
        nums[i] = scan.nextInt();
    }
    double product = nums[0] * nums[1] * nums[2];
        System.out.println("The product fo your numbers is: " + product );
        System.out.println("The sqaure root of you product is : " + Math.sqrt(product));
        System.out.println("The sqaure of your product is: " + Math.pow(product, 2));
        
}
    
}
