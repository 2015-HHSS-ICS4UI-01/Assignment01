
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost of the DJ");
        double DJ = input.nextDouble();
        System.out.println("Enter the cost of the food");
        double food = input.nextDouble();
        System.out.println("Enter the hall rental cost");
        double rental = input.nextDouble();
        System.out.println("Enter the cost of decorations");
        double dec = input.nextDouble(); 
        System.out.println("enter the cost of the wait staff");
        double staff = input.nextDouble();
        System.out.println("enter the cost of any extra costs");
        double ext = input.nextDouble();
        
        double tot = DJ + food + rental + dec + staff + ext;
        double tic = tot/35;
        System.out.println("The number of tickets required to break even would be " + (int)(Math.ceil(tic)));
                
    }
}
