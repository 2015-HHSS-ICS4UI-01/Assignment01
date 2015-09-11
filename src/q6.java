
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int count = 100;
        
        System.out.println("please enter a number between 100 and 50 to stop at: ");
        int stop = scan.nextInt();
        
        while(count>stop){
         System.out.println(count);
            count-=5; 
         
         
       }
        
        
    }
}
