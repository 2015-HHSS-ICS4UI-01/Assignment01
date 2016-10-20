
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner 

        int number = 0; // the int for number is equal to 0

        String word = new String(); // creating the string for the words

        System.out.println("Enter words and when you are finished entering words enter the word exit.");    // telling the user what to do

        while (!word.equals("exit")) {  // while the inputted word doesn't equal exit do the following
            word = input.nextLine();    // let the user input more words on each line
            number++;   // adding to the int number each time 
        }

        if (word.equals("exit")) {  // while the inputted word does equal exit do the following 
            number = number - 1;    // take the number and subtract one 
            System.out.println("You entered " + number + " words.");    // output the number of words that were entered before "exit" 
        }
    }
}
