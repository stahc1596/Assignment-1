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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter your name");
        //System asks user his/her name
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        //user enters name
        System.out.println("Hello " + name);
        //System greets user with their name
        
    }
}
