
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int total =0;
        System.out.println("Enter a number between 1 and 10");
        int number = input.nextInt();
        
        while(total < number)
        {
            total++;
            System.out.printf("*");
        }
    }
}
