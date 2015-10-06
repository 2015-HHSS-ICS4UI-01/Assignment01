
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Num between 1 and 10 (inclusive)\n>> ");
        num = s.nextInt(); // the side length for the square to be formed by *
        
        for (int i = 0; i < num; i ++)
        {
            for (int j = 0; j < num; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
