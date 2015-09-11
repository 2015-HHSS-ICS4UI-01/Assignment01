
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double ticketPrice = 35.00;
        
        System.out.println("Food cost?");
        double food = input.nextDouble();
        System.out.println("DJ cost?");
        double DJ = input.nextDouble();
        System.out.println("Hall rental cost?");
        double hallRent = input.nextDouble();
        System.out.println("Decorations cost?");
        double decor = input.nextDouble();
        System.out.println("Wait staff cost?");
        double staff = input.nextDouble();
        System.out.println("Other costs?");
        double misc = input.nextDouble();
        
        double expense = food+DJ+hallRent+decor+staff+misc;
        double ticketAmmount = expense/ticketPrice;  
        
        int ans = (int)Math.round(ticketAmmount);
        System.out.println(ans+1 + " tickets would need to be sold to break even.");       
    }
    
}
