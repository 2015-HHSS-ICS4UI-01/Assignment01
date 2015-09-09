
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
        Scanner input = new Scanner(System.in);   //imports the Scanner
        System.out.println("What is your name?"); //asks the user for their name
        String name = input.nextLine(); //set String name to the the name entered by the user
        System.out.println("Hello " + name + "!");   //greets the user by the name they entered
    }
    
}
