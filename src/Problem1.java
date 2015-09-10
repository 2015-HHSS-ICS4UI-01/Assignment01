
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imports the Scanner
        Scanner input = new Scanner(System.in);   
        
        //asks the user for their name
        System.out.println("What is your name?"); 
        //set String name to the the name entered by the user
        String name = input.nextLine(); 
        //outputs a greeting to the user using the name they entered
        System.out.println("Hello " + name + "!");   
    }
    
}
