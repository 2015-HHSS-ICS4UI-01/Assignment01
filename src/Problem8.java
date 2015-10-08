
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("inital amount: ");
        double ia = input.nextInt();
        
        System.out.print("intrest rate as a percent: ");
        double ir = input.nextInt();

        ir = (ir/100) +1;
        
        int year = 1;
        double dm = ia * 2;
        
        for( ; ia <= dm; ia = ia*ir)
            {
                year++;
            }System.out.println("It would take " + year + " years until the money will double");

        
        for( ; ia <= 1000000 ; ia = ia*ir)
            {
                year++;
            }System.out.println("It would take " + year + " years until the money will reach 1000000$");
        
    }
}
