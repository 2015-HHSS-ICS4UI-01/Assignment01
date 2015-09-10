
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
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);
        
        //ask user how much money is in their savings account, stores as variable
        System.out.println("Enter the initial amount of money in your savings.");
        //initializes the balance as a variable
        double balance = 0;
        //while balance is less than or equal to zero
        while(balance <= 0)
        {
            //allow the user to input their balance
            balance = input.nextDouble();
            
            //if balance is less than zero
            if(balance < 0)
            {
                //inform the user, allow them to reenter their balance
                System.out.println("ERROR: Money cannot be negative.");
            }
            //if balance is less than zero
            else if(balance == 0)
            {
                //inform the user, allow them to reenter their balance
                System.out.println("ERROR: If you don't have money, how will you calculate your savings?");
            }
        }
        
        //ask user for their interest rate in a decimal form, stores as variable
        System.out.println("Please enter your interest rate.");
        double interest = 0;
        
        //while interest is less than or equal to zero
        while(interest <= 0)
        {
            interest = input.nextDouble();
            
            //if interest is less than zero
            if(interest < 0)
            {
                //inform the user, allow them to reenter their balance
                System.out.println("ERROR: Interest cannot be negative.");
            }
            //if interest is less than zero
            else if(interest == 0)
            {
                //inform the user, allow them to reenter their balance
                System.out.println("ERROR: You need an interest rate to calculate your savings over time.");
            }
        }
        
        if(interest > 1)
        {
            interest = interest / 100;
        }
        
        //calculates the value double of user's initial savings
        double doubled = balance * 2;
        
        //initializes the years when user's balance is doubled/1 million as variables
        int yearDouble = 0;
        int yearMil = 0;
        int year = 0;
        
        //initializes a boolean to determine whether or not the user's initial amount has been doubled
        boolean alreadyDoubled = false;
        boolean alreadyMillion = false;
        
        if(balance >= 1000000)
        {
            alreadyMillion = true;
        }
        
        do{
            //calculate the growth of user's money per year
            double balanceNew = (1 + interest) * balance;
            //each year, replace balance's value with that of the year before's 
            balance = balanceNew;
            //increase by one year each round
            year++;
            //informs the user of each year and accumulated balance
            System.out.println("Year " + year + ": " + balanceNew); 
            
            //check for the year user's amount has doubled until the year is found
            if(!alreadyDoubled)
            {
                if(balanceNew >= doubled)
                {
                    yearDouble = year;
                    alreadyDoubled = true;
                }
            
            }
            
            //check for the year user's amount has reached/surpassed a million if not already   
            if(!alreadyMillion)
            {
                if(balanceNew >= 1000000)
                {
                yearMil = year;
                }
            }
                
        //stop checking when both years have been determined    
        }while(!alreadyDoubled || !alreadyMillion);
        
        //inform the user how many years it will take to double their savings
        System.out.print("It will take " + yearDouble + " years to double your savings");
        //and how many years it will take to reach a million dollars
        System.out.println(" and " + yearMil + " years to reach a million dollars.");
        
    }
    
}
