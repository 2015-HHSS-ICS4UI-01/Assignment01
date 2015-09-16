/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author natalie
 */
public class problem7 {
    
    public static void main(String[] args){
        //rate growth
        double rate = 0.014;
        //the year acts as a counter
        double year = 1999;
        //zeros on the end of the billion will be added when the number is outputted
        double population = 6;
        
        //double endYear;
        
        while (population < 10){
                double annualgrowth = population*rate;
                population = population + annualgrowth;
                double endYear = year++;
                System.out.println("In the year " + endYear + ", The population will reach " + population + " billion.");
            }
            
            
            
        
        
        
    }
    
}
