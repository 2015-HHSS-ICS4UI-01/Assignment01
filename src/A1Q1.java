
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // creating the scanner
        
        System.out.println("Please enter your name.");  // asking for the users name
        String name = input.nextLine(); // user inputs their name 
        System.out.println("Hello " + name + "!");  // outputs a greeting followed by the users inputted name
               
    }
}
