
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for user input
        Scanner input = new Scanner (System.in);
        
        //ask user for number
        System.out.println("Please enter a number between 1 and 10.");
        int num = input.nextInt();
        
        //output asterisks for num input
        for(int i = 0; i< num; i++ ){
            System.out.print("*");
        }
        
    }
}
