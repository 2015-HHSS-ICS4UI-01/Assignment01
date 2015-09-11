
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[3];
        for(int i = 0; i < 3; i++){
            num[i] = input.nextInt();
        }
        int product = num[0] * num[1] * num[2];
        System.out.println(product);
        System.out.println(Math.sqrt(product));
        System.out.println(Math.pow(product,2));
    }
}
