
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>=1 && num<=10){
        for(int i = 0; i < num; i++){
            for(int e = 0; e < num; e++){
            System.out.print("*");
            }
            System.out.println();
        }
        }   
    }
    }

