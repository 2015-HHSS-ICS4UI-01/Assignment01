
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 words");
        String[] words = new String[10];
        int i = 0;
        while( i<10){
        words[i]  = scan.next();
        i++;
        }
        
       int chars = 0;
       int n = 0;
       while( n<10){
        chars  = chars + words[n].length() ;
        n++;
        }
        System.out.println("The average is: "+(chars/10));
    }
}

