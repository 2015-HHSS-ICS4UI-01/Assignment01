
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int numberEntered = input.nextInt();
        String asterisks = "";
        for (int x = 0; x != numberEntered; x++)
        {
            asterisks += '*';
        }
        System.out.println(asterisks);
    }
}
