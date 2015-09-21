
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tot = 0; 
        Scanner in = new Scanner(System.in);
        String[] words = new String[10];
        for(int i=0; i < words.length; i++ )
        {
            System.out.println("please enter a word famm");
            words[i] = in.nextLine();
            tot += words[i].length();
        }
        System.out.println(Math.round(tot/words.length));
    }
}
