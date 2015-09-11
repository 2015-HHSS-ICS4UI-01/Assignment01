
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at");
        int stop = input.nextInt();
        int count = 100;
        int countDown = 5;
        
        while(count > stop)
        {
            System.out.println(count);
            count = count - countDown;
        }
        
    }
}
