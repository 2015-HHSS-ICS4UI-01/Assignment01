
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int num = input.nextInt();
        int total = 100;
        if(num>=50 && num <=100){
        while(total >= num){
            System.out.println(total);
        total-=5;
    } 
    }
    }
}
