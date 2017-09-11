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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String[] words = new String[10];
        //Array to hold every word
        int count = 0;
        //Variable to count the letters in the words
        System.out.println("Please enter 10 words");
        //System asks user to enter 10 words
        for(int i = 0; i < 10; i++){
            words[i] = in.nextLine();
            count = count + words[i].length();
        }
        //For loop counts every letter in the words entered
        System.out.println("The total word length is " + count);
        //System gives user the total amount of letters in the words
    }
}
