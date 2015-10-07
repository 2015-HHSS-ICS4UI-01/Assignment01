
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number between 50-100");
        int num = input.nextInt();
        while(num > 100 || num <50)
        {
            System.out.println("Try again please please");    
            num = input.nextInt();
        }
        for( int i = 100; i >= num; i= i -5)
        {
            System.out.println(i); 
        }
        
    }
}
