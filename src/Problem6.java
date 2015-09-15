
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int num = input.nextInt();
        int count = 100;
        
        while(num <= count)
        {
            System.out.println(count);
            count = count - 5;
        }
    }
}
