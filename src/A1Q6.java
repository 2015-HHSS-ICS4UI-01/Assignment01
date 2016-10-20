
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // creating the scanner
        
        System.out.println("Enter a number between 50 and 100 to stop at.");    // asking for the number they want it to stop before 
        int num = input.nextInt();  // user inputs the number they want 
        int start = 100;    // the int start will count down from 100
        
        while(num < start){ // while the users number is less than 100 print out numbers going down by 5 each time 
            System.out.println(start);  // outputting the numbers
            start = start - 5;  // go down from 100 by 5's each time 
        }
    }
}
