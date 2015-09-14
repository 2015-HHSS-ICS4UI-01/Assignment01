
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem9 
{
    public static void main(String[] args)
    {
        Scanner stuff =new Scanner(System.in);
        String[] tenWords =new String[10];
        double amount=0;
        
        System.out.print("Please enter ten separate words: ");
        for (int i = 0; i < 10; i++)
        {
            String input =stuff.nextLine();
            tenWords[i] = input;
            if(i==9)
            {
                System.out.println("Thank you.");
            }else
            {    
            System.out.print("That's " +(i+1) +", please enter " +(10-(i+1)) +" more: ");
            }
        }
        System.out.println("");
        
        for (int i = 0; i < 10; i++)
        {
            amount =amount+tenWords[i].length();
        }
        amount = amount/10;
        System.out.println("The average word length is: " +amount +".");
           
        
    }
}
