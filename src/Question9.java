
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 words");
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextLine();
        }
        
        int total = array[0].length() + array[1].length() + array[2].length() + array[3].length() + array[4].length() + array[5].length() + array[6].length() + array[7].length() + array[8].length() + array[9].length();
        
        double average =total/10;
        
        
        System.out.println("The average word length is " + average);
        
        
        
    }
    
}
