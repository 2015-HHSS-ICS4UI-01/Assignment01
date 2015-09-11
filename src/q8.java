
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter initial amount: ");
        int initial = scan.nextInt();
        System.out.println("Please enter rate of growth in decimal form: ");
        double rate = scan.nextDouble();
        int product = initial;
        int year = 0;
        while(product<initial*2){
            product = (int) (product*(1+rate));
            year++;
        }
        
        System.out.println("It will take "+year+" years to double");
        
        while(product<1000000){
          product = (int) (product*(1+rate));
            year++;  
        }
        System.out.println("And "+year+" years to reach $1 million");
    }
}
