
import static java.lang.Math.max;
import static java.lang.Math.max;
import static java.lang.Math.min;
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
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare variables
        
        int start = 100;
        //ask user to input a number between 100 and 50
        System.out.println("Please enter a number between 100 and 50");
        int num = input.nextInt();
        
        //start the countdown with 100
        System.out.println(start);

        if(start > num)
        {
            while(start - 5 > num)
            {
            start -=5;
            System.out.println(start);
            }   
    }
    }
}
