
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired amopunt of asterisks between 1-10 plz");
        int num = input.nextInt();
        while(num < 1 || num > 10)
        {
            System.out.println("please try again");
            num = input.nextInt();
        
        }
        for(;num > 0; num--)
        {
            System.out.print("*");
    }
        System.out.println();
}}
 