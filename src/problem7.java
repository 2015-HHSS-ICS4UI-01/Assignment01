/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int population = 6;
    int year = 1999;
    for(double i = 6; i < 10;i=i*1.014 )
            {
                year++;
            }
        System.out.println(year);
    }
}
