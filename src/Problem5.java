
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int num = scan.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.printf("*");
            for (int e = 0; e < num; e--) {
                System.out.printf("\n");    
            }
    
        }
        
    }
}
