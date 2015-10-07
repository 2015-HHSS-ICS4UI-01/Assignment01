
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        long population = 6000000000L;
        double growth = 1.014;
        //int n;
        int years = 0;
        for(;population < 10000000000L;years++) {
            population *= growth;
        }
        System.out.println(years);
        
        
        
        
        
    }
}
