/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jafer
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearsElapsed = 0;
        double populationInBillions = 6;
        int targetPopulation = 10;
        double growthRatePercent = 1.4;
        while (targetPopulation > populationInBillions)
        {
            populationInBillions *= (1 + growthRatePercent / 100);
            yearsElapsed++;
        }
        
        System.out.println("The population will exceed 10 billion after the year " + (1999 + yearsElapsed));
    }
    
}
