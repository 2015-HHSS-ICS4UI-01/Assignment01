
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 5;
        char letter = 'a';
        boolean lightSwitch = true; 
        
        Scanner input = new Scanner(System.in); // to get users input
    
        System.out.println("Please enter your name.");  // asks user to input their name
        String name = input.nextLine(); // user inputs their name
        System.out.println("Hello " + name + "!");
        
        String[] nameList = new String[5];  // make a array of names
        
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Please enter name " + (i + 1));
            nameList[i] = input.nextLine();
        }   
    
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Hello " + nameList[i]);
        }
    
        int num1 = 5;
        int num2 = 10;
        double total = Math.pow(num1 * num2,5);
        double total2 = Math.sqrt(num1 * num2);
    
        int count = 10;
        while(count > 0){
            System.out.println(count);
            count--;
            if(count == 5){
                break;
            }
        }  
    }
}