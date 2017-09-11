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
public class A1Q2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        //Array for numbers used for math calculations(entered by user)
        double math = 0;
        //Variable to help do the math
        System.out.println("Please write three numbers.");
        //System asks user to enter their numbers
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
            //User enters numbers
            if(math == 0){
                math = nums[i];
            }else{
                math = math * nums[i];
            }
            //If statement does the multiplication each time the user enters a 
            //number
        }
        System.out.println("The product of your numbers is " + math);
        //System gives the user the product
        math = Math.sqrt(math);
        //System square roots the product
        System.out.println("The square root of your product is " + math);
        //System gives the user the square root
        math = Math.pow(math, 4);
        //System squares the product
        System.out.println("The square of the product is " + math);
        //System gives the user the exponent
    }    
}
