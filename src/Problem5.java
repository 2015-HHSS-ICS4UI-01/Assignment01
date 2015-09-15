
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number between 1 and 10");
        int number = input.nextInt();
        
        for(int total = number; total >0; total--)
        {
            for(int total2 = number; total2 >0; total2--)
            {
              System.out.printf("*");  
            }
              System.out.printf("\n");            
          }
    }
}
