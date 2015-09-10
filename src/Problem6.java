
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
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);                                 
        
        //asks user for a number from 100 to 50
        System.out.println("Enter a number between 100 and 50 to stop at.");    
        //initializes number as a variable
        int number = 0;                                                         
        
        //while number is less than 50 and greater than 100
        while(number < 50 || number > 100)                                      
            {
            number = input.nextInt();
            
            //if number entered is less than 50 or greater than 100
            if(number < 50 || number > 100)                                     
            {
                //inform user and allow them to reenter
                System.out.println("ERROR: Number must be between 100 and 50.");
            }
            
            }
        
        //initializes start of countdown as variable
        int countdown = 100;                                                    
        
        //counts down from 100 to the number or the closest interval of 5 to the number
        while(countdown >= number)
        {
            System.out.println(countdown);
            countdown = countdown - 5;
        }
    }
    
}
