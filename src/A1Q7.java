
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // starting year
        int year = 1999;
        
        // population in billions
        double popbill = 6;
        
        // while 
        while (popbill < 10) {
            popbill = popbill * 1.014;
            year = year + 1;
        }
        
        if (popbill > 10) {
           System.out.println("The population reached " + popbill + " Billion in the year: " + year);
        }
    }
}
