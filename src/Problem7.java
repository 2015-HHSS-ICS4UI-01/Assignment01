/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double population = 6e9;
        double endPop = 1e10;
        int year = 1999;
        for(double x = population; x < endPop; x+=(x*0.014)){
            year++;
        }
        System.out.println("The population will reach 10 billion in year "+year+".");
    }
}
