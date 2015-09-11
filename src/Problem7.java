/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double population = 6;
        int years = 0;
        while(population<10){
            population*=1.014;
            years++;
        }
        System.out.println(years);
    }
}
