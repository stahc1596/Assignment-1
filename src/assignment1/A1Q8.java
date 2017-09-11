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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of money in the");
        System.out.println("savings account");
        //system asks user for the amount of money in account
        double money = in.nextDouble();
        //User enters amount
        System.out.println("Please enter the interest rate in a percent");
        System.out.println("ie. %14");
        //System asks user to enter interest rate in a percent
        double r = in.nextDouble();
        //User enters interest rate
        r = (r/100) + 1;
        //Interest rate is converted to suit the formula
        double stop = money*2;
        //Variable to help determine how many years till value doubles
        int time = 0;
        //Time at which the money value either doubles or reaches 1000000
        while(money < stop){
            money = money*r;
            time++;
        }
        //System determines how long it takes money to double
        System.out.println("It takes " + time + " years to double your money.");
        //System gives user how long it takes money to double
        while(money < 1000000){
            money = money*r;
            time++;
        }
        //System determines how long it takes money to reach 1000000
        System.out.println("It takes " + time + " years to reach $1000000");
        //System gives user how long it takes money to reach 1000000
    }
}
