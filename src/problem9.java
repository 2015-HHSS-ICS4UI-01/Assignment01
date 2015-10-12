
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word[] = new String[10];
    int length = 0;
    System.out.println("Please type 10 words");
    for(int i = 0; i < word.length; i++)
        {
        word [i] = input.nextLine();
        length = length + word[i].length();
        }
        System.out.println(length/10);
    }
}
