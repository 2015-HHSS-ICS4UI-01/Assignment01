
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100");
        int number = input.nextInt();
        int hundred = 100;
        System.out.println("");
        
        if ( number < 50 || number > 100)
        {
            while (number < 50 || number > 100)
            {
                System.out.println("No, I said a number between 50 and 100");
                number = input.nextInt();
            }
        }
        
        
        while (hundred > number)
        {
            System.out.println(hundred);
            hundred = hundred - 5;
        }
     
        
    }
    
}
