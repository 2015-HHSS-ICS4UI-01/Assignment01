/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simma1980
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long population = 6000000000L; //stores population count
        int year = 1999; //holds current year
        while (population < 10000000000L) { //loops until pop exceeds ten billion
            population *= 1.014; //increases population by 1.4% each year
            year++; //increases year
        }
        System.out.println(year); //prints out year when pop exceeds ten billion
    }
}