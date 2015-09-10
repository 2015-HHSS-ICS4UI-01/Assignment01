
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    /*Write a program to count the total number of characters
     * in a series of 10 words that you enter, and compute the 
     * average word length (store the entered words into an array). 
     * Output the average word length to the console. Remember, you can 
     * get the length of a String by asking it. If your string was called word, 
     * you can use word.length() to return the number of characters the String has. 
     * Name your class Problem9*/
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String[] words = new String[10];
        
        int letterCount = 0;
        for (int i = 0; i < 10; i ++)
        {
            letterCount += s.next().length();
        }
        
        System.out.println((double)(letterCount/10));
        
    }
}
