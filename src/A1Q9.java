
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // establish array
        String[] word = new String[10];
        
        // value for the for loop outputted to user
        int num = 0;
        
        // ask for word and store in array
        for (int i = 0; i < 10; i++){
        System.out.println("Enter word #" + (num + 1) + ":");
        word[i] = input.nextLine();
        num = num + 1;
        }
        
        // value to total the amount of characters
        int charcount = 0;
        
        // add length of each String to charcount
        for (int i = 0; i < 10; i++){
        charcount = charcount + word[i].length();
        }
        System.out.println("There were " + charcount + " letters total.");
        // average word length -- replace 0
        int avg = charcount/10;
        
        System.out.println("The average word length was: " + avg);
    }
}
