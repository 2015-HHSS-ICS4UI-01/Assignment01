
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        String[] words = new String[10]; //stores 10 words
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter a word plz: ");
            words[i] = in.nextLine(); //fills in all array spots with words
            total += words[i].length(); //adds number of characters to total for every word entered
        }
        System.out.println(Math.round(total / words.length)); //divides total characters by num of words
    }
}
