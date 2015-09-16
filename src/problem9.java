/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class problem9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] ar;
        ar = new int [10];
        
                System.out.println("Hello, Please enter the first of ten words.");
                String one = input.next();
                int number1 = one.length();
                
                System.out.println("Please enter the second of ten words.");
                String two = input.next();
                int number2 = two.length();
                
                System.out.println("Please enter the third of ten words.");
                String three = input.next();
                int number3 = three.length();
                
                System.out.println("Please enter fourth of ten words.");
                String four = input.next();
                int number4 = four.length();
                
                System.out.println("Please enter fifth of ten words.");
                String five = input.next();
                int number5 = five.length();
                
                System.out.println("Please enter sixth of ten words.");
                String six = input.next();
                int number6 = six.length();
                
                System.out.println("Please enter seventh of ten words.");
                String seven = input.next();
                int number7 = seven.length();
        
                System.out.println("Please enter eighth of ten words.");
                 String eight = input.next();
                int number8 = eight.length();
                ar [2] = eight.length();
        
                System.out.println("Please enter ninth of ten words.");
                String nine = input.next();
                int number9 = nine.length();
                ar [1] = nine.length();
        
                System.out.println("Please enter one last word.");
                String ten = input.next();
                int number10 = ten.length();
                ar [0] = ten.length();
        
        int sum = number8 + number9 + number10 + number1 + number2 + number3 + number4 + number5 + number6 + number7;
        int average = sum/10;
        System.out.println("average word length is " + average + " characters.");
        
        //int sum = 0;
               
                //for(int i=0; i < ar.length ; i++)
                        //sum = sum + ar[i];
               
                //calculate average value
                //double average = sum / ar.length;
               
                //System.out.println("Average length of words : " + average);
        
        
                /*Integer sum = IntStream.of(ar).sum();
                System.out.println("The sum of characters is " + sum);
                double average = sum/ar.length;
                System.out.println("The average word length is " + average);*/
        
    }
}
