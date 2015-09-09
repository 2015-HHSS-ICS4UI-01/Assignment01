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
    public static void main(String[] args) {
        
        double pop = 6e9;
        double rate = 1.014;
        double goal = 1e10;
        
        double yr = Math.log(goal/pop)/Math.log(rate) + 1999;
        
        System.out.println(Math.ceil(yr));
    }
}
