
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] words = new String[10];
        
        System.out.println("Please enter the words:");
        
        
        words[0] = input.nextLine();
        words[1] = input.nextLine();
        words[2] = input.nextLine();
        words[3] = input.nextLine();
        words[4] = input.nextLine();
        words[5] = input.nextLine();
        words[6] = input.nextLine();
        words[7] = input.nextLine();
        words[8] = input.nextLine();
        words[9] = input.nextLine();
        
        int sum = 0;
        
        for(int x = 0; x < words.length; x++)
        {
            
            sum = sum + words[x].length();
        }
        
        System.out.println("");
        System.out.println("The total characters of the words you enetered was " + sum + ".");
    }
}
