
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[3];
        for(int i = 0; i <number.length; i++)
        {
            System.out.println("Please enter a number");
            number[i] = input.nextInt();
        }
        int total = 1;
        for(int i =0; i <number.length; i++)
        {
            total *=  number[i];
        }
        System.out.println("product is: " + total);
        
        double sqrt = 0;
        sqrt =(Math.sqrt(total));
        
        System.out.println("sqareroot is: " + sqrt);
        
        double power =0;
        power = (Math.pow(total, 2));
        
        System.out.println("number squared is: " + power);
    }
}
