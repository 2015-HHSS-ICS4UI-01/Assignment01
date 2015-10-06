
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i ++)
        {
            System.out.print(">> ");
            nums[i] = s.nextInt(); // populate array from user input
        }
        
        int product = nums[0]*nums[1]*nums[2];
        int square = (int)(Math.pow(product, 2));
        double root = Math.sqrt(product);
        
        System.out.println(product);
        System.out.println(square);
        System.out.println(root);
        
    }
}
