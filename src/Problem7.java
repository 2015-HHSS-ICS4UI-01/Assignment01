/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double population = 6;
        double exceed = 10;
        int year = 1999;
        
        for(; population < exceed; year++)
        {
            population = population * 1.014;
        }
        System.out.println("The population will exceed 10 billion people in " + year);
    }
}
