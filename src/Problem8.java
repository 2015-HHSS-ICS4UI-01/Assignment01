
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the initial amount of money depositied: ");
        double amount = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interest = input.nextDouble();

        interest = interest / 100;

        double money = amount;
        int year = 0;

        double doubled = amount * 2;

        while (money < doubled) {
            money = (1 + interest) * amount;
            year++;
        }
        if (money > doubled) {
            System.out.println("It took " + year + " years to double your money");
            System.out.println(money);
        }


    }
}
