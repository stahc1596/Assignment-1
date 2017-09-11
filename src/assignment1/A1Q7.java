/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author stahc1596
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double population = 6;
         //population of world(will be in billions later since no primitive
         //could hold 6000000000)
         double growth = 1.14;
         //The percentage growth of population per year
         for(int i = 0; i < 10; i++){
             population = population*growth;
         }
         //For loop does all the math for the population in 10 years
         population = population*1000000000;
         //Population changed to billions
         System.out.println("Therefore the population will be " + population);
         System.out.println("in 10 years");
         //Gives the user the population number
         
    }
}
