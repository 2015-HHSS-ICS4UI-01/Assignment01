/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pop = 6.0;
        int year = 1999;
        do{
            System.out.println("The population was " + pop + " in year " + year);
            pop = pop*1.4;
            year++;
        }while(pop < 10.00);
        {
            System.out.println("The population will be " + pop + " billion by year " + year);
        }
        
    }
}
