/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 1999;
        double pop = 6.0;
        double rate = 0.014;
        while (pop <= 10) {
            pop = (pop * rate) + pop;
            year++;
        }
        System.out.println("The population will exceed 10 billion in the year " + year + " at the current growth rate.");
    }
}
