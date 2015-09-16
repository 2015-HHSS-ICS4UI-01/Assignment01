
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] word = new String[10];
        int average = 0;
        
        for(int i = 0; i < word.length; i++)
        {
            System.out.println("Please enter a word");
            word[i] = input.nextLine();
            average = average + word[i].length();
        }
        average = average / 10;
        System.out.println("The average word length is " + average);
    }
}
