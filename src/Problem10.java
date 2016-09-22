
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner for user input
        Scanner input = new Scanner(System.in);
        
        //input string 
        boolean done = false;
        
        //create loop to count words
        while(!done){   
        //ask user to input word
        System.out.println("Please enter any amount of words you wish.");
        String words = input.nextLine();
        StringBuilder sBuilder = new StringBuilder(words);
    
        
        //word count
        int word = 0;
        
        //find spaces
        for(int i=0; i< words.length(); i++){
            if(sBuilder.charAt(i)==' '){
                word= word +1;
            }
        }
        
        //add one since last word wouldnt have space after
            System.out.println((word+1) +" words were entered.");
            
            
            //end with the word "exit"
            if(words.equals("exit")){
                done = true;
                break;
            }
        }
    }
}

