
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner for input
        Scanner input = new Scanner(System.in);
        
        //Make array to store words
        String [] words = new String[10];
        
        //ask user to enter 10 words
        System.out.println("Please enter 10 words seperately.");
        
        //user enters 10 words
        for(int i = 0; i < words.length; i++){
            words[i]=input.nextLine();
        }
        
        //find length of each word
        int one = words[0].length();
        int two = words[1].length();
        int three = words[2].length();
        int four = words[3].length();
        int five = words[4].length();
        int six = words[5].length();
        int seven = words[6].length();
        int eight = words[7].length();
        int nine = words[8].length();
        int ten = words[9].length();
        
        //find average of the ten words and output the answer
        int average = (one+two+three+four+five+six+seven+eight+nine+ten)/10;
        System.out.println("The average amount of words is "+average);
    }
    
}
