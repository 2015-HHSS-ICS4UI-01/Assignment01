
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int[] myNums = new int[3];
        for(int i = 0; i < myNums.length; i++)
        {
            System.out.println("Please enter a number");
            myNums[i] = input.nextInt();
        }
        
        int ans = myNums[0]*myNums[1]*myNums[2];
        double sqr =  Math.sqrt(ans);
        double pow = Math.pow(ans,2);
        
        System.out.println("Product " + ans);
        System.out.println("Exponent " + pow);
        System.out.println("Square root " + sqr);
    }
    
}
