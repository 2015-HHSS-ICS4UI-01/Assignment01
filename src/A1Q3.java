
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // establish "total" value, starting at 0.
        int total = 0;
        
        // user inputs costs, add to total
        System.out.println("Enter price for the food:");
        total = total + input.nextInt();
        System.out.println("Enter price for the DJ:");
        total = total + input.nextInt();
        System.out.println("Enter price for hall rental:");
        total = total + input.nextInt();
        System.out.println("Enter price for decorations:");
        total = total + input.nextInt();
        System.out.println("Enter price for the wait staff:");
        total = total + input.nextInt();
        System.out.println("Enter price for misc expenses:");
        total = total + input.nextInt();
        
        // calculate breakeven point
        int brkevn = total/35;
        
        System.out.println("Your total is: " + total + ". " + "In order to breakeven, you must sell " + brkevn + " tickets.");
        
    }
}
