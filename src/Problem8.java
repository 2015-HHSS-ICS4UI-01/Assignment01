
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial amount: ");
        double initial = input.nextDouble();
        double start = initial;
        System.out.println("Enter the interest rate in decimal form: ");
        double rate  = input.nextDouble();
        double earning = 0; 
        int year = 0;
        
        for (; initial <= 1000000; initial += earning) {
            earning = initial * rate;
            year ++;            
            
            }
            System.out.println("Period to reach a million: " + year);
        initial = start;
        year = 0;
        for (; initial < start*2; initial += earning) {
            earning = initial * rate;
            year ++;            
            
            }
            System.out.println("Doubling period: " + year);
        
        
    }
    
}
