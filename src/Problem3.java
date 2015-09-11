
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
        //initializes the scanner
        Scanner input = new Scanner(System.in);                                 
        
        //initializes the array that will hold each cost related to the prom
        double[] total = new double[6];
        
        //asks user for the cost of the food
        System.out.println("Please enter the cost of the food.");
        //stores the cost of food
        total[0] = input.nextDouble();       
        //asks user for the cost of the DJ
        System.out.println("Please enter the cost of the DJ.");
        //stores the cost of the DJ
        total[1] = input.nextDouble();    
        //asks user for the cost of the hall rental
        System.out.println("Please enter the cost of the hall rental.");
        //stores the cost of the hall rental
        total[2] = input.nextDouble();                                          
        //asks user for the cost of the decorations
        System.out.println("Please enter the cost of the decorations.");
        //stores the cost of the decorations
        total[3] = input.nextDouble();                                          
        //asks user for the cost of the wait staff
        System.out.println("Please enter the cost of the wait staff.");
        //stores the cost of the wait staff
        total[4] = input.nextDouble();                                          
        //asks user for the cost of miscellaneous expenses
        System.out.println("Please enter the cost of miscellaneous expenses.");
        //stores the cost of misc. expenses
        total[5] = input.nextDouble();                                          
        
        //initializes variable for the total cost of prom
        double totalCost = 0;                                                   
       
        //calculates the total cost of prom
        for(int i = 0; i < 6; i++)                                              
        {
            //by adding all costs together
            totalCost = totalCost + total[i];                                   
        }
        
        //outputs to the user the total cost of prom
        System.out.println("The total cost of prom is " + totalCost + ".");     
        
        //divides the total cost of prom by the cost of one ticket
        double breakeven = totalCost / 35;
        //if variable tickets has a decimal following, round up to the nearest integer
        double tickets = Math.ceil(breakeven);                                  
        
        //outputs to the user the number of tickets needed to break even
        System.out.print("To break even, you will need to sell ");              
        System.out.println(tickets + " tickets.");
    }
    
}
