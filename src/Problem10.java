
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Enter a word plz: ");
            String word = in.nextLine(); //asks user for word
            if (word.equals("exit")) {
                System.out.println(count);
                break; //breaks while loop when word is "exit"              
            }
            count++; //adds one to total if word was not "exit"
        }
    }
}
