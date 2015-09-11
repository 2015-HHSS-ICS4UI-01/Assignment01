
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//The prom committee would like a program to help them determine the total
//cost of the prom and the number of tickets they must sell if tickets cost $35.
//The expenses for prom are food, DJ, the hall rental, the decorations,
//the wait staff, and any miscellaneous expenses. Your program will ask them to
//enter in these expenses and will output the total and how many tickets are
//required to break even. Name your class Problem3.

/**
 *
 * @author paulm6438
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("The food cost: ");
        int foodCost=input.nextInt();
        
        System.out.print("The Dj Cost: ");
        int djCost=input.nextInt();
        
        System.out.print("The hall Rental: ");
        int hallRental=input.nextInt();
        
        System.out.print("The Decoration Cost: ");
        int decorationCost=input.nextInt();
        
        System.out.print("The wait Staff Cost: ");
        int waitStaffCost=input.nextInt();
        
        System.out.print("The micellaneous cost: ");
        int micellaneousCost=input.nextInt();
        
        double totalCost = foodCost + djCost + hallRental + decorationCost + waitStaffCost + micellaneousCost;
        
        double totalPpl =  totalCost/35;

        totalPpl = (int) Math.ceil(totalPpl);
        
        System.out.println("The about of tickets that should be sold is: " + totalPpl);
        
    }
}
