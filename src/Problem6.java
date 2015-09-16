
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter a number between 50 and 100 ");
        
        int num = input.nextInt();
        
        if (num > 100 || num < 50) //&& statement means both must be correct, || means or
           
        {
            System.out.println("Please follow direction!");
        } else
         {
            for(int i = 100 ; i >= num ; i = i-5)
            {
                System.out.println(i);
            }
         }
    }
}
