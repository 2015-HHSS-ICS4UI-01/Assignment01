
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter a series of 10 words: ");
        Scanner input = new Scanner(System.in);
        String[] words = new String[2];
        double charCount = 0;
        for (String word: words)
        {
            word = input.next();
            charCount += word.length();
        }
        double average = charCount / words.length;
        System.out.println("You entered " + charCount + " characters");
        System.out.println("The average character count was " + average);
    }
}
