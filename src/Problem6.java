
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
public class Problem6
{
    public static void main(String[] args)
    {
        Scanner stuff= new Scanner(System.in);
        System.out.print("Please enter a number betweem 50 and 100: ");
        int end= stuff.nextInt();
        int start = 100;
        System.out.println("");
        System.out.println("");
        
        if (end >50 && end <100)
        {
            while(start>end)
            {
                System.out.println(start);
                
                start = start -5;
            }
            
        }else
        {
            System.out.println("Please enter the correct values next time.");
        }
        
    }
}
