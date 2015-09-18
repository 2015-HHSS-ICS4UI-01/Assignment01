/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        double pop = 6;
        int popTar = 10;
        int year = 1999;
        double per = 1.4;
 
        while(pop < popTar)
        {
            pop = pop*1.4;
            year++;
        }
        System.out.println("The population will exceed 10 billion in the year "+year);        
    }
}
