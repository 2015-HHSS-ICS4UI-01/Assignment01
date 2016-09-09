
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner for input
        Scanner input = new Scanner(System.in);
        
        //ask user to input number
        System.out.println("Please enter a number between 50 and 100 to stop at:");
        int num = input.nextInt();
        
        //create int to start at 100
        int countdown = 100;
        
        //loop to count down by 5s to the number the user input
        while (num < (countdown + 4)){
            countdown = countdown - 5;
            System.out.println(countdown);
        }
            
        
        
        
        
    }
}
