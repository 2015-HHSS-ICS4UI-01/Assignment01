
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int numWords = 0;
        String word = "";
        
        while(true)
        {
            System.out.print(">> ");
            word = s.next();
            if (word.equals("exit"))
            {
                break;
            }
            numWords ++;
        }
        System.out.println(numWords);
        
        
    }
}
