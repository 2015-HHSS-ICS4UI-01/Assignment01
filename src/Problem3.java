
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem3 {
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        
        final double ticketPrice = 35d;
        
        String[] expenses = new String[]{"food", "DJ", "the rental hall", "the decorations", 
            "the wait staff", "any miscellaneous expenses"};
        
        double total = 0d;
        
        for (String expense: expenses)
        {
            System.out.print(expense + "\n>> ");
            total += s.nextDouble();
        }
        
        double breakEvenPoint = Math.ceil(total/ticketPrice);
        
        System.out.println("total: $" + total);
        System.out.println("break even: " + breakEvenPoint + " tickets");
    }
}
