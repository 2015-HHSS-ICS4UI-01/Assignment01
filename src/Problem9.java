
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nesrine
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables and array
        String[] wordlen = new String[10];
        double totallet = 0;
        double avg = 0;
        
        for(int i = 0; i < wordlen.length; i++)
        {
            //ask user to input words
            System.out.println("Input 10 words");
            wordlen[i] = input.nextLine();
            //add length of letters
            totallet += wordlen[i].length();
        }
            //divide total letters by array length
            avg = totallet / 10;
            //output average
            System.out.println(avg);
    }
    
}
