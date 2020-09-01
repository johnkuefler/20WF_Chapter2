
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter number of miles: ");
        double numberOfMiles = keyboard.nextDouble();
        
        System.out.println("Enter gallons of gas used: ");
        double gallons = keyboard.nextDouble();
        
        double mpg = numberOfMiles/gallons;
        
        System.out.println("You miles per gallon was: " + mpg);
    }
}
