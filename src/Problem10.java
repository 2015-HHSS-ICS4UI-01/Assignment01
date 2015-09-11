
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
        
        boolean exit = false;
        
        while(exit == false){
            if(input.nextLine().equals("exit")){
                exit = true;
            }
            else{
                length++;
            }
        }
        System.out.println(length);
            
            }
            
        }
        
    

