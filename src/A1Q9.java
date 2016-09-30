
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner 

        String words[] = new String[10];    // creating the array - it will have 10 spots 

        for (int i = 0; i < words.length; i++) {    // for loop - do the following 
            System.out.println("Please enter word number " + (i + 1) + ".");    // asking for their words, adding +1 everytime it asks
            words[i] = input.nextLine();    // user inputting their words
        }

        double avg = 0; // creating the double avg which is equal to 0
        double avg2 = 0;    // creating the double avg2 which is also equal to 0

        for (int i = 0; i < 10; i++) {  // for loop - do the following 
            avg = (avg + words[i].length());    // the double avg is equal to avg + the length of the words 
        }

        avg2 = avg / 10;    // the double avg2 is equal to the double avg divided by 10 to find the actual average

        System.out.println("The average length of the words is " + avg2 + "."); // outputting the average length of all the words 

    }
}
