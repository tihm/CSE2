// Timothy Berrill
// CSE 01
// Homework 3, program one (bicycle)
// 2/11/15
// This program will get two inputs from the user, one for cycles recorded
// and another for seconds. It will use this information and information about
// the diameter of the bicycle tire and unit conversions to calculate the 
// distance, time in minutes, and average speed.

import java.util.Scanner;// imports scanner for user input

public class Bicycle{ //standard class required in all java programs
    public static void main(String[] args){//main method
    
    Scanner myScanner;// declare scanner object
    myScanner = new Scanner(System.in);// declare variable for STDIN
    
    System.out.print("Enter the number of seconds: ");// prompt user
    int nSeconds = myScanner.nextInt();// save input into nSeconds
    
    System.out.print("Enter the number of counts: ");// prompt user
    int nCounts = myScanner.nextInt();// save input into nCounts
    
    double diameter = 27;//initialize calculation variables
    double pi = 3.14159;//initialize pi
    double inchesDistance = pi*diameter*nCounts;//calculate distance in inches
    double milesDistance = (double) Math.round((inchesDistance/12/5280)*10000)/10000;//convert inches to miles
    double nMinutes=(nSeconds/60);//convert seconds to minutes
    double nHours=nMinutes/60;//calculate hours
    double averageSpeed=(double) Math.round((milesDistance/nHours)*100)/100;//calculate average speed (miles/hour)
    
    System.out.print("The total distance was "+milesDistance+" miles and took "+
        nMinutes+" minutes to complete.\nThe average speed was "+averageSpeed+".");

    }//end main method
}//end main class