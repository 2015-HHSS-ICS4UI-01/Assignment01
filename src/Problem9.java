
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String[] words = new String[10];
        
        int letterCount = 0;
        for (int i = 0; i < 10; i ++)
        {
            System.out.print(">> ");
            letterCount += s.next().length();
        }
        
        System.out.println((double)(letterCount/10d));
        
    }
}
