
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kampn2687
 */
public class problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number between 1-10 please");
        int num = input.nextInt();
        while (num > 10 || num < 1) {
            System.out.println("Try again please");
            num = input.nextInt();
        }
        for (int i = num; i > 0; i--) {
            for (int j = num; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
