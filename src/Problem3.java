
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        int ticketCost = 35;
        System.out.println("Please enter the expenses for the following areas: ");
        System.out.print("Food: ");
        totalCost+= input.nextInt();
        System.out.print("DJ: ");
        totalCost+= input.nextInt();
        System.out.print("The hall rental: ");
        totalCost+= input.nextInt();
        System.out.print("Decorations: ");
        totalCost+= input.nextInt();
        System.out.print("The wait staff: ");
        totalCost+= input.nextInt();
        System.out.print("Miscellaneous expenses: ");
        totalCost+= input.nextInt();
        
        double breakEven = totalCost / ticketCost;
        System.out.println("The total cost is: " + totalCost);
        System.out.println("In order to break even, you must sell " + breakEven + " tickets.");
    }
}
