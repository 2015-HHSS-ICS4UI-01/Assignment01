
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nesrine
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
        
        //ask user to input a number between 1 and 10
        System.out.println("Input a number between 1 and 10");
        
        //declare variable
        int num = input.nextInt();
        int row = 0;
        int column = 0;
        //while the counter is less than the inputted number
        while(column < num)
        {
            //increase counter column
            column++;
            //go to method astr
            astr(num, row, column);
            System.out.println("");
        }
    }
    static void astr(int num, int row, int column)
    {
        while(row < num)
        {
            //increase counter by one
            row++;
            //output *
            System.out.print("*");
        }
    }
    
}
