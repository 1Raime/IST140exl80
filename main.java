/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19spunit2ps;
import java.util.Scanner;
/**
 *
 * @author rocker
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scnr = new Scanner(System.in);
    //Problem 1    
    double newNumber;
    System.out.print("Enter number here: ");
    newNumber = scnr.nextDouble();
    double numSquared;
    double numCubed;
    double numFourth;
    numSquared = newNumber * newNumber;
    numCubed = newNumber * newNumber * newNumber;
    numFourth = Math.pow(newNumber, 4.0);
    System.out.println("Number entered is: " + newNumber);
    System.out.println("Number squared is: " + numSquared);
    System.out.println("Number cubed is: " + numCubed);
    System.out.println("Number to the 4th power is: " + numFourth);
    
    //Problem 2
    System.out.print("Enter total book price and number of books purchased: ");
    double bookPrice = scnr.nextDouble();
    int numBooks = scnr.nextInt();
    final int shipCharge = 2;
    final double taxCharge = .05;
    double finalPrice = bookPrice + (bookPrice * taxCharge) + (numBooks * shipCharge);
    System.out.println("The total price of the book purchase is: " + finalPrice);
    
    //Problem 3
    System.out.print("Enter number of gallons in tank, fuel efficiency in miles per gallon, and price of gas per gallon: ");
    int gasInTank = scnr.nextInt();
    int fuelEfficiency = scnr.nextInt();
    double priceGas = scnr.nextDouble();
    double priceHundred = priceGas * 100;
    int tankDistance = gasInTank * fuelEfficiency;
    System.out.println("The cost of 100 miles of gas is " + priceHundred);
    System.out.println("The car can go " + tankDistance + " miles per full tank of gas");
    
    //Problem 4
    System.out.print("Enter your 10 digit phone number: ");
    String phoneNumber = scnr.nextLine();
    String areaCode = phoneNumber.substring(0, 2);
    String midNumbers = phoneNumber.substring(3, 5);
    String endNumbers = phoneNumber.substring(6, 9);
    System.out.println("(" + areaCode + ") " + midNumbers + "-" + endNumbers);
    
    
    
    }
    
}
