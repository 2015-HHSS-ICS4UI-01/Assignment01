
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nesrine
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //ask user for inital amount
        System.out.println("Input initail amount: ");
        double initial = input.nextDouble();
        double doubleini = initial*2;
        int yeard = 0;
        int yearm = 0;
        double balance = 0;
        
        //ask user for interest rate
        System.out.println("Input the interest rate in decimal form:");
        double rate = input.nextDouble();

        for(;initial < doubleini; initial+=(balance - initial))
        {
            //determine new balance
            balance = (1 + rate)* initial;
            //increase year by one
            yeard++;
        }
        //output year it takes to double
        System.out.println("It will take " + yeard + "to double");
        
        for(;initial < 1000000; initial+=(balance-initial))
        {
             //determine new balance
            balance = (1 + rate)* initial;
            //increase year by one
            yearm++;
        }
       
        //output year it takes to reach million
        System.out.println("It will take " + yearm + "to reach 1 million");
    }
    
}
