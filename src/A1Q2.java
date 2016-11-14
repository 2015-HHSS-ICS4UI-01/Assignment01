
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // establish array
        double[] numList = new double[3];
        
        // ask user to input each number into array
        for(int i = 0; i < numList.length; i++) {
        System.out.println("Enter number #" + (i+1) + " please!");
        numList [i] = input.nextDouble();
        }
        
        // math!
        double product = numList[0] * numList[1] * numList[2];
        double square = Math.pow(product, 2);
        double squareroot = Math.sqrt(product);
        
        // output values
        System.out.println("The product is: " + product + ". The square is: " + square + ". The square root is: " + squareroot + ".");
        
    }
}
