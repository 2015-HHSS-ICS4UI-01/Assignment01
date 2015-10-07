
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kampn2687
 */
public class Problme2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] numb = new int[3];
        for (int i = 0; i < numb.length; i++) {
            System.out.print("ENTER NUM PLZ: ");
            numb[i] = input.nextInt();
        }
        double stuff = numb[0]*numb[1]*numb[2];
        System.out.println("the total of the numbers multipled with eachother " + stuff);
        System.out.println("the product to the power of two " + Math.pow(stuff,2));
        System.out.println("the square root of the product " + Math.sqrt(stuff));
    }
}
