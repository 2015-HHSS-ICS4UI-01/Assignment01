
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add scanner for input
        Scanner input = new Scanner(System.in);
       
        //Systems asks for users name
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        //Output name
        System.out.println("Hello "+name+".");
        
        //create array for names
        String[] nameList = new String[5];
        
        //loop through array
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Please enter name." +(i+1));
            nameList[i] = input.nextLine();
        }
        
        //say hello to everyone
        for(int i = 0; i < nameList.length;i++){
            System.out.println("Hello "+nameList[i]);
        }
    }
}
