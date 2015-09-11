
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class ProblemTwo {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("please enter 3 whole numbers");
        
        int[] myNums = new int [3];
        for(int i = 0; i < myNums.length; i++)
            {
                System.out.print("Number:");
                myNums[i]=input.nextInt();
            }

        int multNums = myNums[0]*myNums[1]*myNums[2];
        System.out.println("The product is: " + multNums);
        
        double sqrNums = Math.sqrt(multNums);
        System.out.printf("The the square of the product to 3 deciaml points is: %.2f \n", sqrNums);
        
        int powNums = (int) Math.pow(multNums,2);
        System.out.println("The product powered to 2 is: " + powNums);
    }
    
}
