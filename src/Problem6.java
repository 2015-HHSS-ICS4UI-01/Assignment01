
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 50 and 100 to stop at: ");
        int finalNumber = input.nextInt();
        int number = 100;
        while (number - 5 > finalNumber)
        {
            number -= 5;
            System.out.println(number);
        }
    }
}
