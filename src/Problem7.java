

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 1;
        for(double i = 6 ; i <= 10 ; i = i * 1.4)
        {
            System.out.println(i);
            y++;
            
        }System.out.println("it would take " + y + " years to reach 10 billion");
    }
}
