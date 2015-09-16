
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 words");
        String[] words = new String[10];
        int total = 0;
        for(int i = 0; i<=9; i++)
        {
           words[i] = input.next(); 
           
        }
       for(int p = 0; p<=9; p++ ){
           total = total + words[p].length();
       }
       double average = total/10;
       
        System.out.println("The average number of letters is " + average);
    }
}
