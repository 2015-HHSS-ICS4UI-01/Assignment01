
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int num = scan.nextInt();
        for(int n = num;n>0;n--){
        
            for(int i = num;i>0;i--){
            System.out.printf("*");
        }
            System.out.printf("\n");
    }
    }
}
