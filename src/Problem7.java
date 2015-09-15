
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long main = 6000000000L;
        long goal = 10000000000L;
        long year = 1999;
        
        
        
         while (goal>main){
             year++;
             
         main *= 1.014;  
         }
         
         System.out.println("The population will reach 10 billion in " + year);
        
    }
}
