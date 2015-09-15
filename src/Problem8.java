
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int years = 0;
        System.out.println("Please enter how much money you will be putting into the bank");
        double ammt = scan.nextInt();
        System.out.println("Please enter the interest rate (in a decimal)");
        double inter = scan.nextFloat();
        double oneyear = (1 + inter) * ammt;
        
        
        

        System.out.println("It will take " + years + " years to double your money");
        
    }
}
