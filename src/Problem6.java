
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 50 and 100: ");
        int total =100;
        int number = input.nextInt();
        
        System.out.println(total);
        while(number < total)
        {
            total-=5;
            if (total < number)
            {
                
                break;
            }
            System.out.println(total);
        }
        
    }
    
}
