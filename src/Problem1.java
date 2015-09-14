
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tituo4996
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner stuff = new Scanner (System.in);
        System.out.print("What is you name: ");
        
        String name = stuff.nextLine();
        System.out.println("Hello, " +name +".");
    }
}
