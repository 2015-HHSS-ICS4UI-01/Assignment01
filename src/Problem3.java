
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //tickets are $35
        //food
        System.out.print("Enter the cost of food:");
        double Food = in.nextDouble();
        //dj
        System.out.print("Enter the cost of the DJ:");
        double Dj = in.nextDouble();
        //hall
        System.out.print("Enter the cost of the hall rental:");
        double Hall = in.nextDouble();
        //decorations
        System.out.print("Enter the cost of the decorations:");
        double Deco = in.nextDouble();
        //waiters
        System.out.print("Enter the cost of the wait staff:");
        double Wait = in.nextDouble();
        //misc
        System.out.print("Enter the cost of any other expenses:");
        double Misc = in.nextDouble();
        //how many tickets to break even
        double ans = Food + Dj + Hall + Deco + Wait + Misc;
        double answer = ans/35;
        System.out.println("It will take " + answer + " tickets to break even.");
    }
}
