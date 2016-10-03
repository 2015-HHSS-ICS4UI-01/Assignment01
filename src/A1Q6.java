
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        int start = 100;
        
        System.out.println("I will count backwards by 5s, starting at 100 until I reach WHICH number:");
        int stop = input.nextInt();
        
        while (start > (stop + 4)) {
            start = start - 5;
            System.out.println(start);
        }
        
        System.out.println("DONE!");
    }
}
