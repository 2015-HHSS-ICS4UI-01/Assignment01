
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
        Scanner input = new Scanner(System.in);                                 //initializes the scanner
        
        System.out.println("Enter a number between 100 and 50 to stop at.");    //asks user for a number from 100 to 50
        int number = 0;                                                         //initializes number as a variable
        
        while(number < 50 || number > 100)                                      //while number is less than 50 and greater than 100
            {
            number = input.nextInt();
            
            if(number < 50 || number > 100)                                     //if number entered is less than 50 or greater than 100
            {
                System.out.println("ERROR: Number must be between 100 and 50.");//inform user and allow them to reenter
            }
            
            }
        
        int countdown = 100;                                                    //initializes start of countdown as variable
        
        while(countdown >= number)
        {
            System.out.println(countdown);
            countdown = countdown - 5;
        }
    }
    
}
