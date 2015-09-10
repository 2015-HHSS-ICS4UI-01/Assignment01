
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three different integers. Separate them by line:");
        int[] numbers = new int[3];
        for (int x = 0; x != 3; x++)
        {
            numbers[x] = input.nextInt();
        }
        
        int product = (numbers[0] * numbers[1] * numbers[2]);
        System.out.println("The product of these numbers is: " + product);
        System.out.println("The product to the power of two is: " + Math.pow(product, 2));
        System.out.println("The square root of the product is: " + Math.sqrt(product));
    }
}
