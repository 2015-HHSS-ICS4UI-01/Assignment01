
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of food: ");
        double food = input.nextDouble();
        
        System.out.print("Enter the cost of the DJ: ");
        double dj = input.nextDouble();
        
        System.out.print("Enter the cost of the hall rental: ");
        double hall = input.nextDouble();
        
        System.out.print("Enter the cost of the decorations: ");
        double decorations = input.nextDouble();
        
        System.out.print("Enter the cost of the wait staff: ");
        double staff = input.nextDouble();
        
        System.out.print("Enter any miscellaneous expenses: ");
        double miscellaneous = input.nextDouble();
        
        double costSum = food + dj + hall + decorations + staff + miscellaneous;
        
        
        System.out.println("The sum of the costs is: " + costSum);
        
        
        double tickets = costSum/35;
        
        System.out.println("You will have to sell " + tickets + " tickets to break even");
        
        
    }
}
