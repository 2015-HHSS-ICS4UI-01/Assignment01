/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class problem5 {
    
    public static void main(String[] args) {
        
        //problem4
        //gets input for integer
        Scanner myNums = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");
        int number;
        number = myNums.nextInt();
        
        //determines how many asterisks to use according to input number
        switch (number) {
            
            case 1: System.out.println("*");
                break;
            
            case 2: System.out.println("**\n**");
                break;
                
            case 3: System.out.println("***\n***\n***");
                break;
                
            case 4: System.out.println("****\n****\n****\n****");
                break;
                
            case 5: System.out.println("*****\n*****\n*****\n*****\n*****");
                break;
                
            case 6: System.out.println("******\n******\n******\n******\n******\n******");
                break;
                
            case 7: System.out.println("*******\n*******\n*******\n*******\n*******\n*******\n*******");
                break;
                
            case 8: System.out.println("********\n********\n********\n********\n********\n********\n********\n********");
                break;
                
            case 9: System.out.println("**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********");
                break;
                
            case 10: System.out.println("**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********");
                
            default: System.out.println("That's not a valid number."); 
                break;
                
        }
        
    }
    
}
