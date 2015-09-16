
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int num = input.nextInt();
        int star = 0;
        if(num < 1 || num > 10)
        {
            System.out.println("Please follow the instructions and restart.");
        }else
        do{
        if(num >= 1 && num <= 10)
        {
        
        for(int ast = 1; ast<=num; ast++)
        {
            for(int i = 1; i<= num; i++)
            {
            System.out.print("*");
            }
            System.out.println("");
            star++;
        }
        }
        }while(star < num);  
            
        
    }
}
