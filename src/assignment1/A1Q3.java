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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double[] expenses = new double[6];
        //The variable for all expenses in an array
        double total = 0;
        //The total of all expenses
        int tickets = 35;
        //Ticket costs
        System.out.println("Please enter all expenses.");
        //System asks for expenses
        for(int i = 0; i < 6; i++){
            expenses[i] = in.nextDouble();
            //User enters expenses
            total = total + expenses[i];
            //System adds expense as user inputs them
        }
        System.out.println("Total expense cost comes to " + total);
        //System gives user the total
        total = total / tickets;
        //System determines how many tickets are needed
        System.out.println("The number of tickets needed to sell is " + total);
        //System gives user the amount of tickets needed
    }
}
