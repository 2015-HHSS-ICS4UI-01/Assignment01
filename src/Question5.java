
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of stars you would like(between 1 and 20)");
        int star = input.nextInt();
        System.out.println("");
        for (int coun = 1; coun <= star; coun++)
        {
      
            for (int counter = 1; counter <= star; counter++)
            {
            
                   System.out.print("*"); 
             }
            
            System.out.println("");
         }   
            }
}
