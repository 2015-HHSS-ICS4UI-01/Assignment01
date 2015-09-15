
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murra9546
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        //ask user to input a number between 1 and 10
        System.out.println("Input a number between 1 and 10");
        
        int num = input.nextInt();
        int counter = 0;
        //while the counter is less than the inputted number
        while(counter < num)
        {
            //increase counter by one
            counter++;
            //output *
            System.out.print("*");
        }

    
    
    }
}
