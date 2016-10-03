
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Scanner
        Scanner input = new Scanner(System.in);

        // input String
        boolean done = false;

        // loop of asking for words until "exit" is entered, "words" is string for input
        while (!done) {
            System.out.println("Enter as many words as you wish on one line.");
            String words = input.nextLine();
            StringBuilder sBuilder = new StringBuilder(words);

            // word count variable
            int amt = 0;
            // go through letters until a space is found
            for (int i = 0; i < words.length(); i++) {
                if (sBuilder.charAt(i) == ' ') {
                    amt = amt + 1;
                }
            }

            // adding 1 to the amount since the last word will not have a space after it
            System.out.println("You have entered " + (amt + 1) + " words.");

            // exit progra,
            if (words.equals("exit")) {
                done = true;
                break;
            }
        }
    }
}
