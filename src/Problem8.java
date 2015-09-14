
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
public class Problem8 
{
    public static void main(String[] args)
    {
        Scanner stuff = new Scanner(System.in);
        int years=0;
        System.out.print("Please enter the amount of money it the account: ");
        double amountIn = stuff.nextDouble();
        double dif =0;
        System.out.println("");
        System.out.print("Please enter the intrest rate in percent: ");
        double rate = stuff.nextInt();
        rate = rate/100;
        System.out.println(rate);
        
        System.out.println("");
        
        double amountOut= amountIn;
        while(amountOut <amountIn*2)
        {
            dif = amountOut * rate;
            amountOut = amountOut + dif;
            years++;
        }
        
        System.out.println("It will take " +years +" years until the account's value will double.");
        
        while(amountOut <1E6)
        {
            dif = amountOut * rate;
            amountOut = amountOut + dif;
            years++; 
        }
        System.out.println("Additionaly it will take " +years +" years until the account will reach a million dollars.");
    }
}
