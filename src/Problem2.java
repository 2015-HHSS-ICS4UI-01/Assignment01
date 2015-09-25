
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) { //asks user to fill in all array spots w numbers
            System.out.print("Enter an integer plz: ");
            nums[i] = in.nextInt();
        }
        double product = 1;
        for (int i = 0; i < nums.length; i++) { //multiplys all array ints together
            product = product * nums[i];
        }
        double square = Math.pow(product, 2); //finds square of product
        double sqrt = Math.sqrt(product); // finds square root of product
        System.out.println(product); //outputs all three previous doubles
        System.out.println(square);
        System.out.println(sqrt);
    }
}
