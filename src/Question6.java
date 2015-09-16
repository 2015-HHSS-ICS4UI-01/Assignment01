
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100.");
        int number = input.nextInt();
        int hunna = 100;
        if (number < 50 || number > 100){
            System.out.println("Please follow the instructions.");
            input.nextInt();
        }
        while (hunna > number){
            System.out.println(hunna);
            hunna = hunna - 5;
        }
        
    }
}
