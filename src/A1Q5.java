
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Request a number between 1 and 10.");
        int starCount = input.nextInt();
        
        // value that counts lines
        int output = 0;
        
        while (output != starCount) {
            // outputting on same line
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
        // go down one line
            System.out.println("");
        // add 1 to output value
            output = output + 1;
      }
    }
}
