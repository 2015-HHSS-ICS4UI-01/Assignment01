
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int TicketPrice = 35;
        
        System.out.println("how much does food cost?");
        int food = input.nextInt();
        
        System.out.println("how much does the DJ cost?");
        int dj = input.nextInt();
        
        System.out.println("how much does the Hall Rental cost?");
        int HallRental = input.nextInt();
        
        System.out.println("how much does the decorations cost?");
        int decorations = input.nextInt();
        
        System.out.println("how much does the wait staff cost?");
        int staff = input.nextInt();
        
        System.out.println("how much does the miscellaneous expenses cost?");
        int miscellaneous = input.nextInt();
        
        int total = (food + dj + HallRental + decorations + staff + miscellaneous);
        
        int tickets = total/TicketPrice;
        System.out.println("since each ticket costs $35, you will need to sell " + tickets + " to cover the cost" );
    }
}
