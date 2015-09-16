
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        String words;
        System.out.print("Enter here: ");
        do {
            words = input.nextLine();
            counter++;
        } while (!words.equals("exit"));
        System.out.println(counter);
        
    }
    
}
