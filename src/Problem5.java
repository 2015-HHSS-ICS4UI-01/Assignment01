
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer between 1 and 10 plz: ");
        int next = in.nextInt(); //stores user inputed number
        while (next > 10 || next < 1) {
            System.out.print("Try again plz: ");
            next = in.nextInt(); //restores number if guidelines are not met
        }
        for (int i = next; i > 0; i--) {
            for (int j = next; j > 0; j--) {
                System.out.print("*"); //outputs number of asterisks on one line
            } 
            System.out.println(); //next line
        } //loops to make another asterisk row until num of rows equals inputed number
    }
}
