
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
