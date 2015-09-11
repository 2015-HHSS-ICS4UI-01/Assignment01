
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String word = "";
        int count = 0;
        while(true){
            System.out.println("Please enter a word: ");
            word = scan.next();
            if(word.equals("exit")){
                break;
            }
            count++;
            
        }
        System.out.println("The total number of words entered is: "+count);
    }
}
