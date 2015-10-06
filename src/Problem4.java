
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
public class Problem4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Num between 1 and 10 (inclusive)\n>> ");
        num = s.nextInt();
        
        System.out.println(new String(new char[num]).replace("\0", "*")); //creates a new empty string of length "num", and replaces each empty clot with a *
        
    }
    
}
