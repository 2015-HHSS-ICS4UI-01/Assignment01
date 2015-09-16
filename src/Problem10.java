
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        System.out.println("Enter a word on each line until you 'exit'");
        while(true)
        {
            String word = input.nextLine();
            if(word.equals("exit"))
            {
                System.out.println("You entered " + count + " words");
                return;
            }else
            {
                count++;
            }
        }
    }
}
