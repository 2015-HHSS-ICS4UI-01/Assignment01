
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        //initializes string used for calculating number of words typed
        String s;
        
        //initializes number of words typed as a variable
        int words = 0;
        
        //informs the user to begin inputting words
        System.out.println("Enter as many words as you would like.");
        
        //allows the user to input words
        do{
            s = input.nextLine();
            
            //counts the number of words typed by the user
            words++;
            
        //user can no longer enter words after inputing the word 'exit'
        }while (!s.equalsIgnoreCase("exit"));
        
        //removes the last word typed (exit) from the word count
        words = words - 1;
        
        //inform the user how many words they typed in total
        System.out.println("You entered a total of " + words + " words.");
        
    }
}
