
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Problem3 {
    
    
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int[] cost = new int[6];
         double total = 0;
         double ticket = 35;
         double sale = 0;
         
         for (int i = 0; i < 6; i++) {
             System.out.println("Enter cost of food, DJ, hall rental, decorations, wait staff,  miscellaneous expenses respectively: ");
             cost[i] = input.nextInt();
             if (i == 0) {
             total = cost[i];    
             }else if (i > 0) {
                 total += cost[i]; 
             }
        }
         

            System.out.println("Total is " + total);
            sale = total/ticket;

            System.out.println("You must sell " + sale); 
            
     }
    
    
}
