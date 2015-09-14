
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem3 
{

    public static void main(String[] args)
    {
        Scanner stuff=new Scanner(System.in);
        System.out.print("How much did the prom cost? ");
        double cost = stuff.nextInt();
        double ticket;
        
        ticket= cost/35;
        System.out.println("You will need to sell " +Math.ceil(ticket) +" tickets to break even.");
        
    }
}
