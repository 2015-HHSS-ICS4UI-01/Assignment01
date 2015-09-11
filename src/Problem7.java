/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double population = 6;

        int year = 1999;

        double percentage = 1.4;

        double add;

        while (population < 10) {
            add = 0;

            add = population / 1.4;

            population += add;

            year += 1;

            System.out.println(population);
        }
        System.out.println("The population is " + population + " billion in the year " + year);
    }
}
