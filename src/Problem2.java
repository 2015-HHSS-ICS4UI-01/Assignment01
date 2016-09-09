
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add scanner for input
        Scanner input = new Scanner(System.in);
        
        //create array for the three numbers
        double [] numList = new double[3];
         
        //loop for the user to input 3 numbers
        for(int i = 0; i < numList.length; i++){
            System.out.println("Please enter number "+(i+1));
            numList[i] = input.nextInt();
        }
        
        //calculate the product, square root and square of the three numbers
        double product = numList[0] * numList[1] * numList[2];
        double sqrt = Math.sqrt(product);
        double pow = Math.pow(product, 2);
        
        //output the product, square root and square
        System.out.println("The product is "+product);
        System.out.println("The square root of the product is "+sqrt);
        System.out.println("The product to the power of two is "+pow);
    
        
      
        
        
    }
}
