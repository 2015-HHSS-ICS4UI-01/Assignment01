
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");
        int number = input.nextInt();
        int[] array = new int[number];
        
        for(int i = 0; i < number; i++) 
        {
            if(number >= 1 && number <= 10)
            {
             for(int j = 0; j < number; j++)
             {
                 System.out.print("*");
             }
            }else
            {
                System.out.println("Please enter a valid number next time!");
                System.exit(i);
            }
            System.out.println();
        }
    }
}
