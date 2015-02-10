// Timothy Berrill
// CSE 02 Homework 3 (Root)
// 2/11/15
// The purpose of this program is to give a crude estimation of the cubed root
// of a user entered number

import java.util.Scanner;//import scanner for user input

public class Root{
    public static void main(String[] args){
        
        Scanner myScanner;// construct object for user input
        myScanner=new Scanner(System.in);//declare variable for STDIN
        
        System.out.print("Enter a double, and I print its cube root: ");//prompt user
        double number = myScanner.nextInt();//get input, store into "number"
        
        double guess = number/3;
        for (int i=0; i<5; i++){//run for loop 4 times
            guess=((2*guess*guess*guess)+number)/(3*guess*guess);//get better estimate
        }//end for loop
        
        double proof=guess*guess*guess;//show its about the cubed root
        System.out.print("The cubed root is: "+guess+":");//tell what the guess is
        System.out.print("\n"+guess+" * "+guess+" * "+guess+" = \n"+proof);
        
    }//end main method
}//end class