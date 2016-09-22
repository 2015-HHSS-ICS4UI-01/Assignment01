
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //scanner for user input
        Scanner input = new Scanner (System.in);
        
        //create int that will help print the asterisks in different rows
        int output = 0;
        
        //ask user for number
        System.out.println("Please enter a number between 1 and 10.");
        int num = input.nextInt();
        
        //output asterisks for number input
        while(output != num){
             for(int i = 0; i< num; i++ ){   
               System.out.print("*");
        }
             System.out.println();
             output = output +1;
        }
       
    }
}
