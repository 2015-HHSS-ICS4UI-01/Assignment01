
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[10];
        double wordLetterCount = 0;
        System.out.println("Please enter 10 words. Enter each word separately and press enter.");
        for (int x = 0; x < words.length; x++) {
            words[x] = input.next();
            wordLetterCount += words[x].length();
        }
        double average = wordLetterCount / words.length;
        System.out.println("The average word length is " + average + ".");
    }
}
