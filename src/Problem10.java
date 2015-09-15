
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.println("Plese enter your words, if you wish to exit type: EXIT");

        boolean run = true;
        while(run = true){
        int countWords = 1;
        int[] WordLengths = new int[countWords];
        int c = 0;
        int numOfWords = 1;
        for (int i = 0; i < numOfWords ; i++) {
                String word = in.nextLine();
                if(word.equals("EXIT")){
                    System.out.println("You have typed " + numOfWords + "words.");
                    run = false;
                }
                int length = word.length();
                WordLengths[c] = length;
                c++;
                countWords++;
                numOfWords++;
        }
        
        numOfWords = numOfWords - 1;
        int add = 0;
        int cc = 0;
        for (int i = 0; i < numOfWords ; i++) {
            add = add + WordLengths[cc];
        }
        int av = add/10;
        System.out.println("The average length of word is " + av);
        }
    }
    
}
