
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonah
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //up to a million dollars
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your current ballance.");
        double bal = in.nextDouble();
        System.out.println("Next, please enter your current rate of interest");
        double r = in.nextDouble();
        int year = 0;
        double million = 1E6;
        
        while (bal<million){
            year++;
            bal = bal*r;
        }
        System.out.println("in " + year + "years you will have a million dollars in your account");
    }
    
}
