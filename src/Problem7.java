
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nesrine
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //declare variables
        double pop6 = 6;
        double growthrate = 0.014;
        double pop10 = 10;
        double newpop = 0;
        int year = 1999;

        //if the population is less than 6
        for(;pop6 < pop10; pop6+= newpop)
        {
            //the new population is the initial population times the growthrate
            newpop = pop6*growthrate;
            //add one year
            year++;
        }
        //output what year it will exceed 10 billion
        System.out.println(year);
        
            
            
    }
    
}
