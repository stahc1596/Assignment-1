/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at");
        //System asks user to enter a number between 50 and 100
        int num = in.nextInt();
        //User enters a number
        for(int i = 100; i >= num; i--){
            System.out.println(i);
            i = i - 4;
        }
        //For loop prints every number from 100 to requested number in intevals
        //of 5
    }
}
