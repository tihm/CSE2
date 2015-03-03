// Timothy Berrill
// CSE 02 homework 6 (Run Factorial)
// 2/3/15
// This program will calculate factorials that begin between 9 and 16.
// It will ask the user for input between 9 and 16, make sure the input is valid
// and then calculate the factorial of the number.

import java.util.Scanner;//import scanner for user input
public class RunFactorial{//standard java class in every java program
    public static void main(String[] args){//begin main method
        
    Scanner myScanner;//create object for scanner use
    myScanner = new Scanner(System.in);//designate myScanner as variable for user input
    int number=-3323;//create number variable for later user input
    System.out.println("Please enter an integer that is between 9 and 16: ");//prompt the user for input
    while (number>16||number<9){//while number is outside of the range
        while(!myScanner.hasNextInt()){//while there is no integer input from user
            System.out.println("Invalid Input! Enter again!");//tell the user they messed up
            myScanner.next();//move along scanner
        }//end while loop
        number=myScanner.nextInt();//save input into number
        if (number>16||number<9){//check if the integer is outside of range
            System.out.println("Invalid input! Enter again!");//tell the user they messed up
        }//end if for positivity
        else {break;}//otherwise get outta the while loop yo'
    }//end while loop
    
    int sum=1;//create varialbe for sum
    System.out.println("Input accepted:");//tell the user they finally did it right
    System.out.print(number+"! = ");//print out start of syntax for answer
    while(number>0){//while number is positive
        sum*=number;//multiply number into sum
        number--;//subract one from number
    }//end while loop
    
    System.out.println(sum);//print out the sum
    
    }//end main method of the program
}// end the class