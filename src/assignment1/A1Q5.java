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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        //Systems asks user for number
        int num = in.nextInt();
        //User inputs number
        for(int i = num; i > 0; i--){
            for(int e = num; e > 0; e--){
                System.out.print("*");
            }
            //The second for loop gives user the amount of asterisks requested
            System.out.println();
        }
        //The first for loop gives the user the amount of lines requested
    }
}
