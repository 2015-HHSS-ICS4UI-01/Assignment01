
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cost for the food: ");
        double food = input.nextDouble();
        System.out.println("Please enter the cost for the DJ: ");
        double djCost = input.nextDouble();
        System.out.println("Please enter the cost for the decorations: ");
        double decorations = input.nextDouble();
        System.out.println("Please enter the cost for the wait staff: ");
        double waitStaff = input.nextDouble();
        System.out.println("Please enter the cost for the miscellaneous: ");
        double misc = input.nextDouble();
        double totalCost = food+djCost+decorations+waitStaff+misc;
        System.out.printf("The total is: $%.2f\n", totalCost);
        System.out.println("You need to sell "+Math.ceil(totalCost/35)+" tickets to break even");
    }
}
