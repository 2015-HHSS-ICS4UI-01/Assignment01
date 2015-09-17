
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(true )
        {
            System.out.println("please enter a word");
            String word = input.nextLine();
            if(word.equals("exit"))
            {
               break; 
            }
            i++;
        }
        System.out.println("The amount of words you printed were " + i);
        

        
    }
}
