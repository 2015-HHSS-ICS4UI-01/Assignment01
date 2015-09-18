
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Please enter the number of stars you would like between 1 to 10: ");
        int star = input.nextInt();
        
        
        
        if (star > 10 || star < 1)
        {
            System.out.println("You did not enter a number between 1 to 10, please try again..." );
            
            star = input.nextInt();
            
        }else if(star >=1 && star <= 10)
        {
            for(int i = 0; i < star; i++)
           {
              for(int row = 0; row < star; row++ )
              {
                  System.out.print("*");
              } 
               System.out.println();
               
           }
           
            
            
        }
    }
}
