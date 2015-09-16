/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class problem10 
{
    public static void main(String[] args)
    {
        
        System.out.println("Please enter as many words as you like. Stop by entering 'exit'. ");
        Scanner input = new Scanner(System.in);
        
        List<String> myList = new ArrayList<>();
        
        boolean exit = false;
        
        myList.add("start");
        
        for (int counter = 0; counter < myList.size(); counter++)
        {
            System.out.println("Enter next word:");
            String words = input.next();
            myList.add(words);
            if ("exit".equals(words))
                {
                    System.out.println("You have exited the program");
                    System.out.println("The number of words you entered: " + counter);
                    exit = true;
                    System.exit(0);
                }
        }
        
        
    }
    
    
}
