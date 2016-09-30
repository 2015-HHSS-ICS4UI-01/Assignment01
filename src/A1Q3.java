
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner

        System.out.println("Please enter your name.");  //asking for name 
        String name = input.nextLine(); // inputting name

        System.out.println("Hello, " + name + "! Please enter the expenses for the proms food.");   // asking for food costs
        double food = input.nextDouble();   // inputting food costs

        System.out.println("Thank you, " + name + ". Now please enter the expense for the DJ.");    // asking for DJ costs
        double dj = input.nextDouble(); // inputting DJ costs 

        System.out.println("Now please enter the expense for the hall rental " + name + ".");   // asking for rental costs 
        double hall = input.nextDouble();   // inputting rental costs 

        System.out.println("Now the expense for the decorations."); // asking for decor costs 
        double decor = input.nextDouble();  // inputting decor costs 

        System.out.println("Now please enter the expense for the waiting staff.");  // asking for waiters costs       
        double staff = input.nextDouble();  // inputting waiters costs 

        System.out.println("And finally please enter the miscellaneous expenses " + name + ".");    // asking for misc costs 
        double misc = input.nextDouble();   // inputting misc costs 

        double totalcost = (food + dj + hall + decor + staff + misc);   // getting the total costs of everything added up
        double tickets = Math.ceil(totalcost / 35);   // dividing the total costs by 35 to see how many they need to sell to break even

        System.out.println("You will have to sell " + tickets + " tickets to break even.");    // outputting the total number of tickets needed to break even

    }
}
