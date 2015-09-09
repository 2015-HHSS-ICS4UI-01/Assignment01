/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    
    /*The world population reached 6 billion people in 1999 and was growing at the 
     * rate of 1.4 percent each year. Assuming that the population will continue 
     * to grow at the same rate, write a program to determine and output to the screen 
     * when the population will exceed 10 billion. Name your class Problem7.*/
    public static void main(String[] args) {
        
        double pop = 6e9;
        double rate = 1.014;
        double goal = 1e10;
        
        double yr = Math.log(goal/pop)/Math.log(rate) + 1999;
        
        System.out.println(Math.ceil(yr));
    }
}
