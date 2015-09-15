
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
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number between 100 and 50: ");
        int num = in.nextInt();
        
        int[] count5 = new int[num];
        for(int i = 100; i > count5.length; i-=5){
            System.out.println(i);
        }
    }
    
}
