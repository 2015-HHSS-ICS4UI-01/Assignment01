
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomt9963
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        boolean typing = true;
        System.out.println("Please enter your words.");
        System.out.println("Type 'exit' to quit stop the program.");
        while (typing) {
            String s = input.nextLine();
            if (s.equals("exit") || s.equals("Exit")) {
                break;
            }
            counter++;
        }
        System.out.println("You typed in " + counter + " words");


    }
}
