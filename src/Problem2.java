
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
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double[] array = new double[3];
        double prod = 0;
        double sqr = 0;
        double prodsqrt = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Number: ");
            
            array[i] = input.nextInt();
            
            
        }
        prod = array[0] * array[1] * array[2];
        System.out.println("The product is: " + prod);
        
        
        sqr = Math.pow(prod,2);
        System.out.println("The product is: " + sqr);       
        
        prodsqrt = Math.sqrt(prod);
        System.out.println("The product is: " + prodsqrt); 
        
    }
    
}
