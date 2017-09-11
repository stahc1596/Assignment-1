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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int count = 0;
        //Variable will hold the letter count
        String word = "empty";
        //Variable will hold every word entered by user
        System.out.println("Please enter your words. When you're done, type exit");
        //System asks user to input their words
        while(true){
            word = in.nextLine();
            //User inputs words
            if(word.equals("exit")){
                break;
            }else{
                count = count + word.length();
            }
            //If statement checks if the user is finished entering words
        }
        //While loop allows user to enter word repeatedly
        System.out.println("The total amount of letters is " + count);
        //System tells user the total ampunt of letters in their words
    }
}
