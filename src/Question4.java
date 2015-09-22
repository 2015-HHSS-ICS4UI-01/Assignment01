
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tracy
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Input a number between 1 - 10");
        int num = input.nextInt();
        for (int i = 1;i <= num; i++){
            System.out.print("*");
        }
    }
    
}
