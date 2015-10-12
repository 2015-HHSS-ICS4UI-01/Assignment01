
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your initial amount: ");
    double initial = input.nextInt();
    System.out.print("Enter your decimal interest rate: ");
    double r = input.nextDouble();
    int year = 0;
    
    for(double i = 1; i < 2;i=i*(1+r) )
            {
                year++;
            }
        System.out.println("It will take " + year + " year(s) to double your money");
        for(double i = 1; i < 2;i=i*(1+r) )
            {
                year++;
            }
        year = 0;
        for(double i = 1000000; i > initial;initial=initial*(1+r) )
            {
                
                year++;
            }
        System.out.println("It will take " + year + " year(s) to make one million dollars");
    }
}
