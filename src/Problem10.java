
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        Scanner input = new Scanner(System.in);
        boolean done = false;
        boolean out = false;
        String word = "";
        int count = 0;
        while(done != true)
        {
        System.out.println("Please enter a word");
        word = input.nextLine();
        out = false;
        
        if(word.equals("exit"))                                                  
        {
            done = true;
        }else
        {
            count++;
        }
        }
        System.out.println("You entered " + count + " words");
    }
}
