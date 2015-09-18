
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Boolean run = true;
        
        int counter = 0;
        
        System.out.println("Enter 'exit' at any point to stop the program.");
        
        while(run)
        {
            
            System.out.println("Please enter a word: ");
            String word = input.nextLine();
            
            counter++;
            
            
            if(word.equals("exit"))
            {
                run = false;
            }
            
        }
        
        System.out.println("You entered " + counter + " words in total.");
        
        
        
        
        
                
                
        
        
        
    }
}
