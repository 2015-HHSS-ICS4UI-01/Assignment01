/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem7 
{
    public static void main(String[] args)
    {
        int year=0;
        double rate=1.4;
        double pop=6.0E9;
        double dif=0;
        while(pop <10.0E9)
        {
            dif = pop *0.014;
            pop = pop +dif;
            year++;

        }
        
        System.out.println("In "+(year +1999) +" the world population will reach 10 billion.");
    }
}
