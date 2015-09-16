
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter a number between 1 and 10: ");
         
        int num = input.nextInt();
        if (num > 10 || num < 0) //&& statement means both must be correct, || means or
           
        {
            System.out.println("Please follow direction!");
        } else
        {
            for(int i = 1 ; i <= num ; i++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
        
    }
}
