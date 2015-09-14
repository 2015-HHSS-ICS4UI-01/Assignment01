
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];

        for (int x = 0; x < nums.length; x++) {
            System.out.println("Please enter number " + (x + 1) + ".");
            nums[x] = input.nextInt();
        }
        int product = nums[1] * nums[0] * nums[2];
        System.out.println("Product: " + product);
        System.out.println("Square: " + (product * product));
        System.out.println("Root: " + Math.sqrt(product));
    }
}
