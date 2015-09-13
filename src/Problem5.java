
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonah
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number between 1 and 10:");
        int num = in.nextInt();
        
        int[] oneten = new int[num];
        for(int i = 0; i < oneten.length; i++){
            for(int j = 0; j < oneten.length; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
