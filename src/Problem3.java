
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double[] costs = new double[6];
        
        {
            System.out.print("Enter the cost for the food: ");
            costs[0] = input.nextDouble();
        
            System.out.print("Enter the cost for the DJ: ");
            costs[1] = input.nextDouble();
        
            System.out.print("Enter the cost for the hall rental: ");
            costs[2] = input.nextDouble();
        
            System.out.print("Enter the cost for the decorations: ");
            costs[3] = input.nextDouble();
        
            System.out.print("Enter the cost for the wait stuff: ");
            costs[4] = input.nextDouble();
        
            System.out.print("Enter the cost for miscellaneous: ");
            costs[5] = input.nextDouble();
        }
        
       double sum = 0;
        
       for(int i = 0; i < costs.length; i++)
       {
           sum = sum + costs[i];
       }
        
       sum = sum / 35;
       
       sum = Math.round(sum);
       
        System.out.println("You will need to sell " + sum + " ticket(s) to break even.");
        
    }
}
