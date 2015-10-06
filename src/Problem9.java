
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomt9963
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean typing = true;
        int sumStrings = 0;
        String[] strings = new String[10];
        System.out.println("Input 10 words");
        for (int i = 0; i < 10; i++) {
            strings[i] = input.nextLine();
            sumStrings = strings[i].length() + sumStrings;
        }
        System.out.println("The average word length = "+sumStrings/2);


    }
}
