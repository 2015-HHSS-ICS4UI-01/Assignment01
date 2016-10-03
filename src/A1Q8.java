
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // year count
        int years = 0;
        
        // discover initial amount
        System.out.println("Enter initial amount:");
        double initialamt = input.nextInt();
        
        System.out.println("Enter interest rate:");
        double intrate = input.nextDouble();
        
        // inital amount doubled
        double dbld = initialamt * 2;
        
        // until 
        while (initialamt < dbld) {
            initialamt = (1 + intrate) * initialamt;
            years = years + 1;
        }
        
        // 
        if (initialamt >= dbld) {
            System.out.println("It will take " + years + " years until the initial amount will double.");
    }
    }
}
