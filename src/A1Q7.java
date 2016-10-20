/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pop = 6;     // the double for population is equal to 6
        
        int year = 1999;    // the integer for year is equal to 1999
        
        while(pop <= 10){   // while the population is less then 10 billion, take the population and multiply it by the % is raises by each year
            pop = pop * 1.014;  // taking the population and multiplying it by the % it raises by each year
            year = year + 1;    // the year goes up by 1 everytime the population raises
        }
        
        System.out.println("The population will reach 10 billion is the year " + year); // outputting the year the population will reach 10 billion
        
        
        
        
        
        
        
    }
}
