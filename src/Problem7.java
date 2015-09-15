
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
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double pop = 6;
        double startpop = 0;
        double newpop =0;
        int count = 1999;
        
        while(pop < 10)
        {
            newpop = pop * 0.014;
            pop += newpop;
            
            count+=1;
            if(pop > 10)
            {
                System.out.println("Populations will be at 10 billion " + count + " years to reach 10 billion");
            } 
           
        }
        
        
    }
    
}
