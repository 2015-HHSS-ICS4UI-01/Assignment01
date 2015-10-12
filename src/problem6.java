
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 50 and 100 to stop at: ");
    int number = input.nextInt();
    while(number < 50 || number > 100)
        {
            System.out.print("Please enter a number between 50 and 100 IDIOT! ");
            number = input.nextInt();
        }
    for(int i = 0; i < 101-number;i=i+5 )
            {
               System.out.println(100-i);
            }
    }
}
