
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        
        //creat a count varriable 
        int count = 0;
        //create a whilelooop to collect more than one word
        // if exit is typed then the loop will break
        while(true)
        {
            //get input from user
            System.out.println("please enter a word");
            String word = in.nextLine();
            
            if(word.equals ("exit")){
                System.out.println(count);
                break;
                
            }
            count++;
        
        
        //after enter new line 
        
        // everytime word is entered add to count 
        
        //once broken display count
        
        }
        
        
    } 
        
    }

