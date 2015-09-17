
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double years = 0;
        System.out.println("Please enter how much money you will be putting into the bank");
        double intammt = scan.nextInt();
        System.out.println("Please enter the interest rate");
        double inter = scan.nextDouble();
        inter = inter/100;
        
        while (true){
            if (intammt<(intammt*2)){
                intammt = (1+inter) * intammt;
                years ++;
            } else{
                break;
            }
        }
        
        System.out.println("It will take " + years + " years to double your money");
        
    }
}
