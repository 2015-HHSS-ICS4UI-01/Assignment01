
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner for input
        Scanner input = new Scanner(System.in);
        
        //user inputs expenses of prom
        System.out.println("Please enter the expenses for food:");
        int food = input.nextInt();   
        System.out.println("Expenses for DJ:");
        int dj = input.nextInt();        
        System.out.println("Expenses for hall rental:");
        int rental = input.nextInt();       
        System.out.println("Expenses for decorations:");
        int deco = input.nextInt();       
        System.out.println("Expenses for staff");
        int staff = input.nextInt();       
        System.out.println("Expenses for misc.:");
        int misc = input.nextInt();
        
        //calculate and output total of prom
        int total = food + dj + rental + deco + staff + misc;
        System.out.println("The total cost is: $"+total);
        
        //calculate how many tickets will need to be sold to break even
        int breakeven = total/35;
        
        //output number of tickets to be sold
        System.out.println(breakeven+ " tickets will need to be sold to break even.");
    }
}
