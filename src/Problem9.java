
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
        String[] word = new String[10];
        
        for(int i = 0; i< word.length; i++){
            word[i] = input.nextLine();
            length += word[i].length();
        }
        
        System.out.println(length/10);
    }
}
