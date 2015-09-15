


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double tickets;
        double Dj;
        double food;
        double hall;
        double deco;
        double staff;
        double misc;
        System.out.println("Please enter the cost of the DJ:");
        Dj = scan.nextDouble();
        System.out.println("Please enter the cost of the Food:");
        food = scan.nextDouble();
        System.out.println("Please enter the cost of the Hall:");
        hall = scan.nextDouble();
        System.out.println("Please enter the cost of the Decorations:");
        deco = scan.nextDouble();
        System.out.println("Please enter the cost of the Staff:");
        staff = scan.nextDouble();
        System.out.println("Please enter the cost of Misc expensives:");
        misc = scan.nextDouble();
        tickets = (Dj + food + hall + deco + staff + misc) / 35;
        
        System.out.println("Here is the total cost of expensives: " +(Dj + food + hall + deco + staff + misc));
        System.out.println("To break even the school must sell " + tickets + " to break even");
        
    }
}
