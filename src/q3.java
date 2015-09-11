
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the food cost: ");
        int food = scan.nextInt();
        System.out.println("Please enter the DJ cost: ");
        int DJ = scan.nextInt();
        System.out.println("Please enter the hall rental cost: ");
        int hall = scan.nextInt();
        System.out.println("Please enter the decorations cost: ");
        int decor = scan.nextInt();
        System.out.println("Please enter the wait staff cost: ");
        int staff = scan.nextInt();
        System.out.println("Please enter the misc costs: ");
        int misc = scan.nextInt();
        
        int total = food+DJ+hall+decor+staff+misc;
        double tickets = total/35;
        
        System.out.println("Total cost: $"+total);
        System.out.printf("Tickets required: %.2f\n", tickets);
    }
}
