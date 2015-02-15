// Timothy Berrill
// CSE 02 Homework 4 (Banking)
// 2/17/15
// This is a program that will give the number a random amount of money between 1000 and 5000
// dollars in their bank account, it will allow them to deposit a positive value, withdraw money
// as long as they have enough, and also allow them to view their current balance then print the 
// value of their account at the end of their action.

import java.util.Scanner;//import scanner for user input

public class Banking{//standard class required in every java program
    public static void main(String[] args){//the main method for Banking
    
    Scanner myScanner;//create object for user input
    myScanner=new Scanner(System.in);//initialize myScanner variavle for user input
    
    double accountBalance=Math.random()*(5000-1000)+1000;//generate double from 1000 to 5000
    accountBalance = (double) Math.round(accountBalance*100)/100;//round to two decimal places giving a dollar and cent amount for the account
    
    System.out.print("Would you like to:\n1-Depoist Money\n2-Withdraw Money\n3-View Balance\n:");//ask user to enter a number for each banking option
    String userChoice=myScanner.nextLine();//stores the user input into "userChoice"
    switch (userChoice){//begin switch for user input
    
    case "1"://This is the case for user depositing money into account
        System.out.print("How much would you like to deposit?: ");//ask the user how much to deposit
        if (!myScanner.hasNextDouble()){//if there is no number
            System.out.print("You need to enter a number\n");//tell them they did it wrong
            return;//end program
        }//end if
        double depositAmount=myScanner.nextDouble();//stores the user input into "depositAmount"
        if (depositAmount>0){//check to see if deposit amount is positive
            accountBalance+=depositAmount;//chance the current balance to the balance + the amount desposited
            System.out.print("Your current balance is now: $"+accountBalance);//print out the currect balance
            return;//end the program
        }//end if
        else{//if the amount is not positive
            System.out.print("You need to enter a positve number.\n");//tell the user they need to enter a positive number
            return;//end the program
        }//end switch for deposit amount (all options in switch for deposit end in a return)
        
    case "2"://This is the case for user withdrawing money from the account
        System.out.print("How much would you like to withdraw?: ");
        if (!myScanner.hasNextDouble()){//if there is no number
            System.out.print("You need to enter a number\n");//tell them they did it wrong
            return;//end program
        }//end if
        double withdrawAmount=myScanner.nextDouble();//save the withdraw amount into withdraw amount
        if (withdrawAmount<accountBalance){//begin if for withdrawl
        //if they have enough money in their account to withdraw how much they desire
            accountBalance-=withdrawAmount;//set account to their previous balance minus the amount they want to withdraw
            System.out.print("Your current balance is now: $"+accountBalance);//tell them how much they have left in their account
            return;//end the program
            }// end the if
        else{//if they do not have enough money in their account
            System.out.print("You do not have that much money in your account.\n");//tell the user they dont have enough money
            return;//end the program
        }//end the else
        
    case "3"://This is the case for the user wanting to check their balance
        System.out.print("You have $"+accountBalance+" in your account.\n");//tell the user how much they have in their account
        return;//end the program
        
    default://default choice
        System.out.print("That was not a valid choice.\n");//tell the user their input was not valid
    }//end switch for user choice
        
    }//end main method
}// end public class