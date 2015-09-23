
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and initial amount.");
        double balance = input.nextInt();
        System.out.println("Input the interest rate.");
        double r = input.nextDouble();
        double doubled = balance * 2;
         int count = 0;
         int count1 = 0;
         while (balance <= 10000000){
             count1++;             
        while (balance <= doubled){ 
            count++;
             balance = (1 + r) * balance;
        }      
    }
         System.out.println("The balance will reach $10000000 in " + count1 + " years.");
        System.out.println("The balance will double in " + count + " years.");
    }
}
