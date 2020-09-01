
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
public class StringManipulator {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        // get favorite city from user as string
        System.out.println("Enter your favorite city: ");
        String favCity = keyboard.nextLine();
        
        // calculate number of characters in city name
        // display number of characters
        int length = favCity.length();
        System.out.println(length);
        
        // calculate city name in upper case
        // display upper case city name
        String upperCase = favCity.toUpperCase();
        System.out.println(upperCase);
        
        // calculate city name in lower case
        // display lower case city name
        String lowerCase = favCity.toLowerCase();
        System.out.println(lowerCase);

        
        // get first character of name of city
        // display first character
        char first = favCity.charAt(0);
        System.out.println(first);
        
    }
}
