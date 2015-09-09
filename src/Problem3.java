
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //initializes the scanner
        
        double[] total = new double[6];
        
        System.out.println("Please enter the cost of the food.");
        total[0] = input.nextDouble();                                          //stores the cost of food
        System.out.println("Please enter the cost of the DJ.");
        total[1] = input.nextDouble();                                          //stores the cost of the DJ
        System.out.println("Please enter the cost of the hall rental.");
        total[2] = input.nextDouble();                                          //stores the cost of the hall rental
        System.out.println("Please enter the cost of the decorations.");
        total[3] = input.nextDouble();                                          //stores the cost of the decorations
        System.out.println("Please enter the cost of the wait staff.");
        total[4] = input.nextDouble();                                          //stores the cost of the wait staff
        System.out.println("Please enter the cost of miscellaneous expenses.");
        total[5] = input.nextDouble();                                          //stores the cost of misc. expenses
        
        double totalCost = 0;                                                   //initializes variable for the total cost of prom
        
        for(int i = 0; i < 6; i++)                                              //calculates the total cost of prom
        {
            totalCost = totalCost + total[i];                                   //by adding all costs together
        }
        
        System.out.println("The total cost of prom is " + totalCost + ".");     //outputs to the user the total cost of prom
        
        double breakeven = totalCost / 35;                                      //divides the total cost of prom by the cost of one ticket
        double tickets = Math.ceil(breakeven);                                  //if variable tickets has a decimal following, round up to the nearest int
        
        System.out.print("To break even, you will need to sell ");              //outputs to the user the number of tickets needed to break even
        System.out.println(tickets + " tickets.");
    }
    
}
