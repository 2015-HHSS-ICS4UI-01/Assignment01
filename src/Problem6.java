
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number you would like to stop at: ");
        
        int stop = input.nextInt();
        
        for(int initial = 100; initial >= stop; initial = initial - 5)
        {
            System.out.println(initial);
        }
        
        
        
        
        
    }
}
