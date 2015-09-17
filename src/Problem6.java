
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a number between 50 and 100: ");
        int num = scan.nextInt();
        int total = 100;
        
        while (true){
            if(num <= total){
                System.out.println(total);
            total = total - 5;    
            } else {
                break;
            }
        }
        
    }
}
