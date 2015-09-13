
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String exit = "exit"; 
        int x = 1;
        String[] words = new String[x];
        
//        while(inp != exit)
//        {
//            System.out.println("Input words: ");
//            String word = 
//        }
        
        for(int i = 0; i < words.length; i++)
        {
            while(words[i] != exit)
            {
            System.out.println("Input words");
            words[i] = input.nextLine();
            
            }
            
        }
    }
    
}
