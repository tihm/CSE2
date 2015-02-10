// Timothy Berrill
// CSE 02 Homework 3
// 2/11/15
// This program will take a user inputted number, and print the first
// four digits that appear after the decimal place

import java.util.Scanner; // import scanner for user input

public class FourDigits{
    public static void main(String[] args){
        
        Scanner myScanner; //initialize scanner object
        myScanner = new Scanner(System.in);//create variable for user input
        
        System.out.print("Enter a double and I display the first four numbers\n"+
        "to the right of the decimal point: ");//prompt user
        double number=myScanner.nextDouble();//store input into "number"
        
        int one = (int)(number*10)%10;//Get the first digit after the decimal
        int two = (int)(number*100)%10;//Get the second digit after the decimal
        int three = (int)(number*1000)%10;//Get the third digit after the decimal
        int four = (int)(number*10000)%10;//Get the fourth digit after the decimal
        
        System.out.print("The number is: "+one+two+three+four+"\n");//Print out the four digit number
        
    }// end main method
}// end class
