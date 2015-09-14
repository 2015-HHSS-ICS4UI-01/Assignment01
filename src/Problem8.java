
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the initial amount in the bank account: ");
        double initialAmount = input.nextDouble();

        System.out.println("Please enter the interest rate: ");
        double rate = input.nextDouble();

        int doublingYears = 0;
        int millionYears = 0;

        for (double x = initialAmount; x < 1e6; x += (x * rate)) {
            millionYears++;
        }
        for (double x = initialAmount; x < initialAmount * 2; x += (x * rate)) {
            doublingYears++;
        }
        System.out.println(millionYears);
        System.out.println(doublingYears);
    }
}
