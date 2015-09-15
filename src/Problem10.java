
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String words;
        int count = 0;
        do {
            System.out.print("Please enter a word ");
            words = input.nextLine();
            count++;
        } while (!words.equals("exit"));
        System.out.println("You entered "+count);
    }
    
}
