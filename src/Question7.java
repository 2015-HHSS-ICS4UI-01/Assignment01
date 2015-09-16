/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double six = 6;
        int year = 1999;
        do
        {
            System.out.println("Population: " + six + " Billion "+ " Year: " + year);
            six = six*1.4;
            year++;
        } while (six < 10);
        System.out.println("Population: " + six + " Billion "+ " Year: " + year);
        
        
    } 
    
}
