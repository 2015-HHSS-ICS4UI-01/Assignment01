
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
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //initializes the scanner
        
        System.out.println("Please enter a number between 1 and 10.");          //asks user for a number from 1-10
        int number = 0;                                                         //initializes the number as a variable
        
        while(number < 1 || number > 10)                                        //while number entered is lower than 1 or greater than 10
        {
            number = input.nextInt();                                           //allow user to input a number
            
            if(number < 1 || number > 10)                                       //if number is lower than 1 or greater than 10
            {
                System.out.println("ERROR: Number is not between 1 and 10.");   //inform user, allow them to reenter their number
            }
        }
        
        for(int i = 1; i <= number; i++)                                        //while int i is less than the user's number
        {
            System.out.print("*");                                              //print asterisks equal to the number to the screen
        }
        System.out.println("");
    }
    
}
