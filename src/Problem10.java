
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words = "";
        System.out.println("Please enter as many words as you like. Type exit to end the program.");
        while (true) {
            String inputt = input.next();
            if (inputt.equals("exit")) {
                String[] allWords = words.split(" ");
                System.out.println(allWords.length - 1+" words.");
                break;

            } else {
                words += " " + inputt;
            }
        }
    }
}
