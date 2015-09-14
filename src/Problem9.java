
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
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.println("Plese enter 10 words");

        int[] WordLengths = new int[10];
        int c = 0;
        for (int i = 0; i < 10; i++) {
                String word = in.nextLine();
                int length = word.length();
                WordLengths[c] = length;
                c++;
        }
        int add = WordLengths[0] + WordLengths[1] + WordLengths[2] + WordLengths[3] + WordLengths[4] + WordLengths[5] + WordLengths[6] + WordLengths[7] + WordLengths[8] + WordLengths[9];
        int av = add/10;
        System.out.println("The average length of word is " + av);
    }

}
