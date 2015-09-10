
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word per line. To stop, type 'exit'. ");
        int count = 0;
        while (true)
        {
            if (input.next().equals("exit"))
            {
                break;
            }
            count++;
        }
        System.out.println("You entered " + count + " words");
    }
}
