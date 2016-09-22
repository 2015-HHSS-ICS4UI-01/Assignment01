
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //int for starting year of 1999
        int year = 1999;
                
        //int for population max
        double popmax = 10;
        
        //loop for determining max pop.
        while (popmax<10){
            popmax = popmax * 1.014;
            year = year+1;
        }
        
        //output when the population exceeds 10 billion people
        System.out.println("The worlds population will exceed 10 billion in the year of "+year);
    }
}
