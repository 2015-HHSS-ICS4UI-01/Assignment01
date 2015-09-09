
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    /*Illustrate the growth of money in a savings account. 
     * The user enters the initial amount and the interest 
     * rate used to calculate the number of years until the 
     * money doubles and the number of years until the money 
     * reaches a million dollars. 

Note: The balance at the end of each year is 
(1      + r) * balance
where balance is the previous balance, and r is the annual rate of interest in decimal form. 

Output the number of years it takes for the money to 
* double from the original value and the number of years 
* it will take for them money to reach a million dollars.
* Name your class Problem8.*/
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter principal\n>> ");
        double principal = s.nextDouble();
        
        System.out.print("enter interest rate\n>> ");
        double rate = s.nextDouble();
        
        double endBalance = principal*2;
        double yrs = 0;
        
        while (principal*Math.pow((1+rate), yrs) < endBalance)
        {
            yrs ++;
        }
        System.out.println("double " + yrs);
        
        yrs = 0;
        while (principal*Math.pow((1+rate), yrs) < 1000000)
        {
            yrs ++;
        }
        System.out.println("million " + yrs);
    }
}
