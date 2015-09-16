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
public class problem3 {
    
    public static void main(String[] args) {
    
     //problem 3

        Scanner costs = new Scanner(System.in);

        System.out.println("I am here to help you crunch numbers for your prom budget.");

        //ticket price
        double tix;
        tix = 35;

        //asks for costs
        System.out.println("How much is the cost of food?");
        double food;
        food = costs.nextDouble();

        System.out.println("How much does the DJ cost?");
        double dj;
        dj = costs.nextDouble();

        System.out.println("How much does the rent cost?");
        double rent;
        rent = costs.nextDouble();

        System.out.println("How much do the decorations cost?");
        double decor;
        decor = costs.nextDouble();

        System.out.println("How much does the staffing cost?");
        double staff;
        staff = costs.nextDouble();

        System.out.println("Lastly, how much money is going to miscellaneous expenses?");
        double misc;
        misc = costs.nextDouble();

        //adds up seperate costs
        double promTotal;
        promTotal = food + dj + rent + decor + staff + misc;
        System.out.println("The total cost of your prom is $" + promTotal);


        //Determines number of tickets needed
        double tixResult;
        tixResult = Math.ceil(promTotal / 35);
        System.out.println("The total number of tickets you need to sell is " + tixResult);
}
    
}
