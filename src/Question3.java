
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cost of the food");
        int food = input.nextInt();
        System.out.println("Please enter the cost of the DJ.");
        int dj = input.nextInt();
        System.out.println("Please enter the cost of the hall rental.");
        int hall = input.nextInt();
        System.out.println("Please enter the cost of the decorations.");
        int dec = input.nextInt();
        System.out.println("Please enter the cost of the wait staff.");
        int staff = input.nextInt();
        System.out.println("Please enter the cost of the miscellaneous expenses.");
        int misc = input.nextInt();
        
        int ticket = 35;
        
        int total = misc + staff + dec + hall + dj + food;
        
        System.out.println("The total cost is " + total);
        int sold = total / ticket;
        
        System.out.println("The number of tickets that you will need to sell to break even is " + sold);
        
    }
}
