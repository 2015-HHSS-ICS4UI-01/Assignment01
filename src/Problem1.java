
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //ask user for name
        System.out.println("Please enter your name: ");
        
        //get the name and store in a variable
        String name = input.nextLine();
        
        //outputs the name
        System.out.println("Hello " + name);
        
    }
}
