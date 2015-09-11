
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
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);                                 
        
        //asks the user for a number from 1-10
        System.out.println("Please enter a number between 1 and 10.");          
        
        //initializes the number as a variable 
        int number = 0;                                                            
        
        //while number entered is lower than 1 or greater than 10
        while(number < 1 || number > 10)                                        
        {
            //allow user to input a number
            number = input.nextInt();                                           
            
            //if number is lower than 1 or greater than 10
            if(number < 1 || number > 10)                                       
            {
                //inform user, allow them to reenter their number
                System.out.println("ERROR: Number is not between 1 and 10.");   
            }
        }
        
        //while int i is less than user's number
        for(int i = 1; i <= number; i++)                                        
        {          
            //run loop with int b until equal to user's number
            for(int b = 1; b <= number; b++)                                    
            {
                //to print asterisks equal to user's number
                System.out.print("*");                                          
            }
            
        //starts a new line for the next row of asterisks
        System.out.println("");                                                 
        
        }
        
    }
    
}
