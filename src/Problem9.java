
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[]words = new String[10];
        
        int num = 1;
        
        for(int i = 0; i < words.length;i++)
        {
            System.out.print("please enter word " + num + " : ");
            words[i] = input.nextLine();
            num++;  
        }
        
        for(int i = 0; i < words.length;i++)
        {
            words[i].length
        }
    }
}
