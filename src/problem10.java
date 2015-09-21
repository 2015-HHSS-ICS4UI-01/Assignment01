
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit1 = false;
        int counter = 0;
        System.out.println("Type words");
        while (exit1 == false)
        {
            String word = input.nextLine();
            if (word.equals("exit"))
            {
                exit1 = true;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
