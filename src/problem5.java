
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Request a number between 1 and 10 and output a box of asterisks (*) that correspond with the number input. 
//i.e. If 5 was input your output would look like a 5x5 box.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a integer between 1 and 10: ");
        int number = input.nextInt();
        while(number < 1 || number > 10)
        {
            System.out.print("Please enter a number between 1 and 10 IDIOT! ");
            number = input.nextInt();
        }
        for(int i = 0; i < number; i++)
            {
        for(int j = 0; j < number; j++)
            {
                System.out.print("*");
            }
        System.out.println("");
            }
    }
}
