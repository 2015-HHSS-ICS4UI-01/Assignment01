
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //initialize population as a variable
        double population = 6;
        //initialize current year as a variable
        int year = 1999;
        boolean tenBil = false;
        
        do
        {
            System.out.println(year + ": " + population + " billon");
            population = population + (population * .014);
            year++;
            
            if(population >= 10)
            {
                System.out.println(year + ": " + population + " billon");
                tenBil = true;
                System.out.println("The population will exceed 10 billion in " + year + ".");
            }
        }while(!tenBil);
        
    }
    
}
