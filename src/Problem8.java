
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simma1980
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your bank accounts balance plz: ");
        double initial  = in.nextDouble(); //stores bank balance
        System.out.print("Enter your bank's interest rate plz: ");
        double r = in.nextDouble(); //stores interest rate
        int years = 0; //holds number of year
        for (double i = initial; i < initial*2; years++) { //loops until balance is doubled
            i = (1 + r) * i;
        }
        System.out.println("In " + years + " years, your balance will have doubled!");
        years = 0;
        for (double i = initial; i < 1000000; years++) { //loops until balance exceeds one million
            i = (1 + r) * i;
        }
        System.out.println("In " + years + " years, your balance will have reached $1,000,000!");
    }
}
