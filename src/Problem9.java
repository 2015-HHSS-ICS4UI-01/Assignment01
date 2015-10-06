
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        //enter 10 words
        String word[] = new String[10];
        //starts off with 0 words
        int length = 0;
        System.out.println("Please type 10 words");
        
        //10 wods entered and lengths of words stored
        for(int i = 0; i < word.length; i++)
        {
        word [i] = input.nextLine();
        length = length + word[i].length();
        }
        
        //prints out average length of the words entered
        System.out.println("The average length of the words are " + length/10 + " letters long");
    }
}
