
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Request a number between 1 and 10.");
        int starCount = input.nextInt();
        
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
    }
}
