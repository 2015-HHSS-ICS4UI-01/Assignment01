
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tituo4996
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner stuff = new Scanner (System.in);
        
        double[] nums = new double[3];
        double num;
        System.out.print("please enter three numbers: ");
        
        for (int i = 0; i < nums.length; i++)
        {
            num=stuff.nextInt();
            nums[i]= num;
        }
        num=nums[0];
        double product=num*nums[1]*nums[2];
        System.out.println("The product of the inputed numbers is: " +product);
        double square = product*product;
        System.out.println("The square of the product of the inputed numbers is: " +square);
        double squareRoot = Math.sqrt(product);
        System.out.println("The square root of the product of the numbers is: " +squareRoot);
        
    }
}