
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print(">> ");
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        
        for (int i = 100; i > num; i -= 5)
        {
            System.out.println(i);
        }
        
    }
}
