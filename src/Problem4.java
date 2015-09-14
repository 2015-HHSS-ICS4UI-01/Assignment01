
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem4 
{
    public static void main(String[] args)
    {
        Scanner stuff= new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int amount= stuff.nextInt();
        System.out.println("");
        if (amount >=1 && amount <= 10) 
        {
            for (int i = 0; i < amount; i++)
            {
                System.out.print("*");
            }
        } else
        {
            System.out.println("please enter a number in the requested range.");
        }
    }
}
