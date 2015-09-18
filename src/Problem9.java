
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int num = 0;
        
        String[] words = new String[10];
        for(int i = 0; i< words.length; i++)
        {
            System.out.println("Please enter an word");
            String word = input.nextLine();
            num = word.length() + num;
            words[i] = word;
        }
        int average = num/words.length;
        System.out.println(average);
    }
}
