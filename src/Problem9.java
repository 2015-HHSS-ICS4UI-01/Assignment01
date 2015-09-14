
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String[] words = new String[10];
        
        int[] length = new int[10];
        
        for(int i = 0; i < words.length; i++) {
            System.out.print("Enter a word: ");
            words[i] = input.nextLine();
        }
        
        for(int i = 0; i < words.length; i++) {
            length[i] = words[i].length();
        }
                
        int total = 0;
        
        for(int i = 0; i < length.length; i++){
            total += length[i];
        }
        
        int average = total/words.length;
        
        System.out.println("The average number of letters used is: " + average);
    }
    
}
