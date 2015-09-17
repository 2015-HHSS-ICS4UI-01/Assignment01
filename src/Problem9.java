
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type a word then hit enter: ");
        int total = 0;
        int comp = 0;
        String[] words = new String[10]; 
        
        for (int i = 0; i < 10; i++) {
            words[i] = scan.next();
            total = total + words[i].length();
        }
        comp = total/10;
        
        System.out.println("The average word length is: " + comp);
    }
}
