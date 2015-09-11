
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int[] nums = new int[3];
        for(i=0;i<3;i++){
        System.out.println("Please enter a number");
        nums[i] = scan.nextInt();
        }
        int product = nums[0]*nums[1]*nums[2]; 
        System.out.println("Product: "+ product);
        int square = (int) Math.pow(product, 2);
        double sqrt =  Math.sqrt(product);
        System.out.println("Squared: "+square);
        System.out.printf("Sqrt: %.2f\n ",sqrt);
    }
    
}
