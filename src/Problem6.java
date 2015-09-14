
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to stop countdown at: ");
        int stop = input.nextInt();
        
        int count = 100;
        System.out.println(count);
        
        
        
        while(count != stop) 
        {
            count -= 5;
            if(count < stop) 
            {
                System.exit(0);
                
            }
            if(count > stop || count == stop) 
            {
                System.out.println(count);
            }
            
        }
        
        
        
        
    }
}
