
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonah
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //6 billion start
        //increases by 1.4 a year
        //pop.>10 billion
        Scanner in = new Scanner(System.in);
        
        double pop = 6E9;
        int year = 0;
        double billion = 10E9;
        
        while (pop<billion){
            year++;
            pop = pop*1.014;
        }
        System.out.println("in " + year + " there will be over 10 billion people.");
        
    }
    
}
