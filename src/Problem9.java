
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] word = new String[10];
        int letters = 0;
        double avg = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter word #" + i +" " );
            word[i] = input.nextLine(); 
            letters += word[i].length();
        }
        avg = letters/10;
        System.out.println(word[2]);
        System.out.println("The average word length is: " + avg );
        
    }
    
}
