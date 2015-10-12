
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Question 2
// Write a program that takes in 3 numbers, stored inside of an array. Your program will than output the product of the numbers (the answer when you multiply them together), the square of the product (the product taken to the power of 2), and the square root of the product. These two commands Math.sqrt(number) and Math.pow(number,exponent) will be helpful. Name your class Problem2.

        Scanner input = new Scanner(System.in);
        int[] myNums = new int [3];
        for(int i = 0; i < myNums.length; i++)
        {
            System.out.println("Please enter an int");
            myNums[i] = input.nextInt();
        }
        double ans1 = myNums[0] * myNums[1] * myNums[2];
        System.out.println(ans1);
        double ans2 = Math.pow(ans1,2);
        System.out.println(ans2);
        double ans3 = Math.sqrt(ans1);
        System.out.println(ans3);
    }
}
