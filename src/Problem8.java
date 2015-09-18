import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);		          
        System.out.println("Enter the initial ammount");		
        double initial = input.nextDouble();		
        System.out.println("Enter the interest rate");		
        double interest = input.nextDouble();				
        double balance = initial;
        double balance2 = initial;
        int years;
        int years2;
        
        for(years = 0; balance <= initial*2; years++)
        {
            balance =(1 + interest)*balance;
        }
        for(years2 = 0; balance2 <= 10000000; years2++)
        {
            balance2 =(1 + interest)*balance2;
        }
         
        System.out.println("It will take " + years + " years for the money to double"); 
        System.out.println("It will take " + years2 + " years for the balance to reach 1 million");
    }
}
