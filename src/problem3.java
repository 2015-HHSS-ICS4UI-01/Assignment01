
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 3
        //The prom committee would like a program to help them determine the total cost of the prom and the number of tickets they must sell if tickets cost $35. The expenses for prom are food, DJ, the hall rental, the decorations, the wait staff, and any miscellaneous expenses. Your program will ask them to enter in these expenses and will output the total and how many tickets are required to break even. Name your class Problem3
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        int cost[] = new int [6];
        String word[] = new String[6];
        word[0] = "food: ";
        word[1] = "DJ: ";
        word[2] = "hall rental: ";
        word[3] = "decorations: ";
        word[4] = "wait staff: ";
        word[5] = "miscellaneous expenses: ";
        for(int i = 0; i < cost.length; i++)
        {
        System.out.print("Please enter the cost of the " + word[i]);
        cost [i] = input.nextInt();
        totalCost = totalCost + cost[i];
        }
        System.out.println("The total cost for the prom will be: " + totalCost);
        double tickets = Math.ceil(totalCost/35);
        System.out.println("Therefore you will need to sell: " + tickets);
    }
}
