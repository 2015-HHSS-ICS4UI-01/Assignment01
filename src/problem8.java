/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class problem8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. How much do you have in your savings account?");
        
        double initAmount = input.nextDouble();
        double twiceAmount;
        twiceAmount = initAmount*2;
        
        System.out.println("What is the interest rate?");
        double interest = input.nextDouble();
        
        double endYear = 0;
        boolean printTwice = false;
        while (initAmount < 1000000)
            {
                double annualgrowth = initAmount*interest;
                initAmount = initAmount + annualgrowth;
                endYear++;
                if (initAmount >= twiceAmount && !printTwice)
                {
                    System.out.println("This is double the inital amount");
                    printTwice = true;
                } else {
                }
                System.out.println("It will take " + endYear + " years to reach " + initAmount + " dollars.");
            }
        
        
        
        while (initAmount < twiceAmount)
        {
            double annualgrowth = initAmount*interest;
                initAmount = initAmount + annualgrowth;
                endYear++;
                System.out.println("DOUBLED AMOUNT:");
                System.out.println("It will take " + endYear + " years to reach " + initAmount + " dollars.");
        }
    }
    
}
