
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-10: ");
        int number = input.nextInt();
        int[] horz = new int[number];
        int[] vert = new int[number];
//        for (int i = 1; i <= number; number--) {
//            System.out.print("*");
//            
//
//        }
        for (int x = 0; x != number; x++) {
            
            
            vert[x] = 0;
            if (vert[x] != number ) {
                System.out.println(" ");
                while (horz[x] != number) {
                System.out.print("*");
                horz[x] ++;
                }
                horz[x] = 0;
                vert[x] ++;
            }
            
        }
        
         
        
    }
    
}
