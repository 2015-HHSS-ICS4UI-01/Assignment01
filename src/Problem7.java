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
        
        double startpop = 6;
        double growthrate = 0.014;
        double newpop = 0;
        int year = 1999;

        for(;startpop < 10; startpop+= newpop);
        {
            newpop = startpop*growthrate;
            year++;
        }
        System.out.println(year);
                
    }
    
}
