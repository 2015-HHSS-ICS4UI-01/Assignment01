
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declare counter & array
        int counter = 0;
        String words;
        //ask user to input words until "exit" has been inputted
        System.out.println("Input words");
        do
        {
               words = input.nextLine();
//                //increase counter by 1
                counter++;
        }while(!words.equals("exit"));
 
        System.out.println(counter);
        }
}
