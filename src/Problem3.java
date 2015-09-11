
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Food cost?");
        int total = input.nextInt();
        System.out.println("DJ cost?");
        total = total + input.nextInt();
        System.out.println("Hall rental cost?");
        total = total + input.nextInt();
        System.out.println("Decorations cost?");
        total = total + input.nextInt();
        System.out.println("Wait staff cost?");
        total = total + input.nextInt();
        System.out.println("Miscellaneous expenses?");
        total = total + input.nextInt();
        System.out.println("Total: $" + total);
        System.out.println(total/35 + " tickets needed to break even.");
    }
}
