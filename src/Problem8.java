
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter in the initial amount:");
        double iniAmnt = input.nextDouble();
        double amnt1 = iniAmnt;
        double amnt2 = amnt1;
        System.out.println("Please enter in the interest rate in decimal form:");
        double interest = input.nextDouble();
        
        double doubAmnt = amnt1 * 2;
        int mil = 1000000;
        int year1 = 0;
        int year2 = 0;
        
        while(amnt1 <= doubAmnt)
        {
            amnt1 = amnt1 * (interest + 1);
            year1++;
        }
        while(amnt2 <= mil)
        {
            amnt2 = amnt2 * (interest + 1);
            year2++;
        }
        System.out.println("It will take " + year1 + " years for " + iniAmnt + 
                " to double at " + interest + "%");
        System.out.println("It will take " + year2 + " years for " + iniAmnt + 
                " to reach a million dollars at " + interest + "%");
    }
}
