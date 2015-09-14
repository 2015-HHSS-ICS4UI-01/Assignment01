
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
public class Problem10
{
    public static void main(String[] args)
    {
        Scanner stuff = new Scanner(System.in);
        String inputs;
        int state = 0;
        int count = 0;
        
        System.out.print("Please enter any amount of words, one word at a time: ");
        
        do
        {
            inputs =stuff.nextLine();
            count++;
            if (inputs.equals("exit"))
            {
                state=1;
            }else if(count==1)
            
                System.out.print("You have entered " +count +" word so far.  ");
            else
                System.out.print("You have entered " +count +" words so far.  ");
                
            
        }while(state==0);
        System.out.println("");
        System.out.println("");
        System.out.println("You entered " +count +" words.");
    }
}
