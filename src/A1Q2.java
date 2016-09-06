
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] numList = new String[3];
        
        for(int i = 0; i < numList.length; i++) {
        System.out.println("Enter number #" + (i+1) + " please!");
        numList[i] = input.nextLine();
        }
        
        
    }
}
