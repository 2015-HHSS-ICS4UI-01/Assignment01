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
public class problem6 {
    
    public static void main(String[] args){
        //asks user for number and stores under "number"
        Scanner sumNum = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100 to stop at.");
        int number;
        number = sumNum.nextInt();
        //checks for valid number
        if (number > 100 || number < 50){
            System.out.println("That's not a valid number!");
            System.exit(0);
        }
        //counting starts at 100
        int num = 100;
        
        System.out.println("Countdown commencing:");
        //counts down by fives until number is reached 
        while (num > number)
            {
                num = num - 5;
                System.out.println(num);
            }
        
                    
        
        
        
        
    }
    
}
