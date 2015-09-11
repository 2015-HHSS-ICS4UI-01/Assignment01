/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long goal = 10000000000000L;
        long population = 6000000000000L;
        long year = 1999L;
        double rate = 1.014;
        
        while(population<goal){
           
            year++;
          
            population*=rate;
        }
       
        System.out.println("In "+year+" the population will reach 10 billion");
    }
}
