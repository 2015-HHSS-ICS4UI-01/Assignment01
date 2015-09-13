
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murra9546
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declare varible ticket
        int ticket = 35;
        int[] cost = new int[7];
        int totalcost = 0;
        double sales = 0;
        //ask user for cost
        System.out.println("Input all expenses");
        for(int i = 0; i < 6; i++)
        {
            cost[i] = input.nextInt();
            if(i > 0)
            {
            totalcost += cost[i];
            }else{
                totalcost = cost[i];
            }
        }
        //output total expenses
        
        System.out.println("Total expense is: " + totalcost);
        
        //determine how many tickets they must sell
        sales = totalcost / ticket;
        
        //output the amount of tickets they must sell
        System.out.println("You must sell " + sales + " tickets.");
        
        
    }
}
