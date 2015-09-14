
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 50 and 100 to stop at: ");
        int number = input.nextInt();
        int max = 100;
        while (true) {
            if (number < 101 && number > 49) {
                if ((max - 5) > number) {
                    System.out.println(max);
                    max -= 5;
                } else {
                    System.out.println(max);
                    break;
                }
            } else {
                System.out.println("the number ain't between 50 and 100 yo");
                break;
            }
        }

    }
}
