
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int counter = 0;
        
        
        while (exit == false)
        {
            counter++;
            if(input.nextLine().equals("exit"))
            {
                exit = true;
            }
        }
        
        System.out.println(counter + " words were entered.");
        
        //exit is a word so it is also counted.
        
        
    }
}
