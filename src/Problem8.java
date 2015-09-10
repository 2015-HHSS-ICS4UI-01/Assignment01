
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialAmount = 0;
        double interestRate = 1;
        int years = 0;
        System.out.print("Please enter the initial ammount: ");
        initialAmount = input.nextDouble();
        System.out.print("Please enter the interest rate (in percent): ");
        interestRate = input.nextDouble();
        
        double goalBalance = initialAmount * 2;
        double doubleBalance = initialAmount;
        double millionBalance = initialAmount;
        while (doubleBalance < goalBalance)
        {
            years++;
            doubleBalance *= (1 + interestRate / 100);
        }
        System.out.println("It will take " + years + " years in order to double your initial balance.");
        years = 0;
        while (millionBalance < 1000000)
        {
            years++;
            millionBalance *= (1 + interestRate / 100);
        }
        System.out.println("It will take " + years + " years in order to reach a million dollars.");
        
    }
}
