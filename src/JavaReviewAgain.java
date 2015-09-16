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
public class JavaReviewAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problem1
        //Creates scanner for system input
        Scanner input = new Scanner(System.in);
        
        //asks for users name
        System.out.println("What is your name?");
        
        //Gets name and stores in variable
        String name = input.nextLine();
        
        //outputs to screen
        System.out.println("Hello, " + name + "."); 
    }
    
}
