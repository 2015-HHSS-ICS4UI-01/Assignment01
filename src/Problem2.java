
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomt9963
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] s = new int[3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("Please enter a int");
            s[i] = input.nextInt();
            if (i >= 2) {
                double product = s[0] * s[1] * s[2];
                System.out.println("product = " + product);
                double product1 = Math.pow(product, 2);
                System.out.println("Square of product = " + product1);
                double product2 = Math.sqrt(product);
                System.out.println("Square root of product = "+product2);
                
            }
        }
    }
}
