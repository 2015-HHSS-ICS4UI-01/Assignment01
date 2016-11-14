
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        String[] nameList = new String[5];

        for (int i = 0; i < nameList.length; i++) {
            System.out.println("Please enter name " + (i + 1));
            nameList[i] = input.nextLine();
        }

        for (int i = 0; i < nameList.length; i++) {
            System.out.println("Hello " + nameList[i] + "!");
        }
    }
}
