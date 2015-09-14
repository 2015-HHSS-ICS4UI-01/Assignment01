
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
public class Problem_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        boolean done = false;
        
        String word = "";
        int wordCount = 0;
        
        while(!done) {
            word = input.nextLine();
            if(word.equals("exit")) {
                done = true;
            } else {
                wordCount ++;
            }

        }
        
        System.out.println("You have entered " + wordCount + " words");
        
        
    }
    
}
