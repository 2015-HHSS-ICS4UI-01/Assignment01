
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);
        
        //initializes the 10 words to be entered as an array
        String[] words = new String[10];
        
        //asks the user for 10 words, and to enter 1 word on each line
        System.out.println("Please enter 10 words (1 per line).");
        
        //loop continues until user has entered 10 words 
        for(int i = 0; i < words.length; i++)
        {
            //stores each entered word into the array
            words[i] = input.nextLine();
        }
        
        //initializes the total number of characters as a variable
        double charTotal = 0;
        
        //loop continues until all characters in the words have been totaled up
        for(int i = 0; i < words.length; i++)
        {
            //adds each word's number of characters to the total
            charTotal = charTotal + words[i].length();
        }
       
       //divides total characters by the array length (10) to find the average
       double charAvg = charTotal / words.length;
       
       //outputs the average word lengh to the user
        System.out.println("Average word length: " + charAvg + ".");
        
    }
}
