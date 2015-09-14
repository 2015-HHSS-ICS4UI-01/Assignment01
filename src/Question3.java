
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tracy
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double ticket = 35;
        System.out.println("What is the cost of food?");
        double food = input.nextInt();
        total =  total + food;
        System.out.println("What is the cost of the DJ?");
        double DJ = input.nextInt();
        total =  total + DJ;
        System.out.println("What is the cost of the hall?");
        double Hall = input.nextInt();
        total =  total + Hall;
        System.out.println("What is the cost of decorations?");
        double Dec = input.nextInt();
        total =  total + Dec;
        System.out.println("What is the cost of the staff?");
        double Staff = input.nextInt();
        total =  total + Staff;
        System.out.println("What is the misc cost?");
        double Misc = input.nextInt();
        total =  total + Misc;
        double ticknum1 = total / ticket;
        ticknum1 = Math.round(ticknum1);
        int ticknum = (int) ticknum1;
        System.out.println("Total costs are $" + total);
        System.out.println("To break even you must sell " + ticknum + " tickets.");

    }

}
