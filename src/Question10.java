
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         boolean exit = false;
         int count = 0;
         while(exit == false)
         {
             count++;
             if(input.nextLine().equals("exit"))
             {
                 exit = true;
             }
         }
         //exit does not count as a word for my counter.
         count = count -1;
         System.out.println("You entered " + count +" words");
         
    }
}
