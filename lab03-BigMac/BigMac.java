// Timothy Berrill
// BigMac calculator
// CSE 02 Lab 3
// Feb 6th, 2015
// This program will calculate the cost of a user-entered number of BigMacs
// along with the tax and display the total cost.

import java.util.Scanner; //Imports the scanner for user input

public class BigMac{ //Required for each java program
    public static void main(String[] args){ //main method
    
        Scanner myScanner;//declare scanner object
        myScanner = new Scanner(System.in);//declaring varialbe for STDIN
        
        System.out.print("Enter an integer for number of BigMacs>0: ");//prompt user
        int nBigMacs=myScanner.nextInt();//Get input from user
        
        System.out.print("Enter the cost per BigMac as a double (xx.xx): ");//prompt user for price
        double pBigMacs=myScanner.nextDouble();//Get input from user
        
        System.out.print("Enter the sales tax as a whole number (xx): ");//prompt user for sales tax
        double taxPercent=myScanner.nextDouble();//Get input form user
        
        taxPercent/=100;//gets percent, not whole number
        double cost=nBigMacs*pBigMacs*(1+taxPercent);//calculates total cost
        int dollars=(int) cost;//removes decimals to get dollar cost
        int dimes=(int) (cost*10)%10;// using % operator to return remainder after division (dimes)
        int pennies=(int) (cost*100)%10;// using % operator to return remainder after division (pennies)
        
        System.out.print("\nThe total cost of your "+nBigMacs+" BigMacs at "+
        pBigMacs+" dollars per BigMac with a "+(int)(taxPercent*100)+
        " percent tax is $"+dollars+"."+dimes+pennies);//prints out the total cost and other information
        
        
    }//end main method
}//end of class