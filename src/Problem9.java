
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String[] words = new String[10];
        int totalLength = 0;
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("please enter in a word: ");
            words[i]= input.nextLine();
            
            totalLength += words[i].length();
            
            
            
            
            
        }
        
        System.out.println("Avg Length is " +totalLength/10);
        
    }
    
}
