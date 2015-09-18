
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double population = 6;
        int year = 2015;
                
        do
        {
            population = (population*0.014 + population);
            year = year + 1;
            
        }while (population < 10);
         System.out.println("In the year " + year + " the world's population will be " + Math.round(population) + " billion!");
        
        
        
        
     
        
        
        
    }
}
