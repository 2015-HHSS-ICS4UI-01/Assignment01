
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter a number between 1 and 10: ");
         
        int num = input.nextInt();
        
        for(int i = 1 ; i <= num ; i++)
        {
            
            
            for(int l = 1 ; l <=num ; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
 
    }
}
