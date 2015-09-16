
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");
        int number = input.nextInt();
        int ast = 0;
        
         if (number > 10 || number <1)
        {
            System.out.println("No I said a number between 1 and 10.");
        }
         else 
             do
             {
         if (number >= 1 && number <=10)
         {
        for (int e = 1; e<=number; e++)
        {
             for (int i = 1; i<= number; i++)
           {
               System.out.print("*");
           }
               System.out.println("");
               ast++;
           }
         } 
         
             }while (ast < number);
         
             
         
    }
}


