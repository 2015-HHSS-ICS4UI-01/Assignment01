
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter in the food cost:");
        int food = input.nextInt();
        System.out.println("Please enter in the hall rental cost:");
        int hall = input.nextInt();
        System.out.println("Please enter in the decorations cost:");
        int decor = input.nextInt();
        System.out.println("Please enter in the wait staff cost:");
        int staff = input.nextInt();
        System.out.println("Please enter in the misc. expenses:");
        int misc = input.nextInt();
        
        int total = food + hall + decor + staff + misc;
        int tickets = total / 35;
        System.out.println("The total cost is " + total);
        System.out.println("You must sell " + tickets + " tickets to break even");
        
    }
}
