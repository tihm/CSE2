// Timothy Berrill
// CSE 02 lab 4 Cookies
// 2/13/15
// This Program will take several inputs from the user including a number of:
// People, Cookies, and Cookies Per Person. The program will test to see if the
// input is valid, and tell the user if it's not. Then It will tell the user
// if there are enough cookies, how many additional cookies they need to buy,
// and whether or not the amount of cookies divides evenly into the number
// of people.

import java.util.Scanner; //Import scanner for user input

public class Cookies{//standard class needed for all java programs
    public static void main(String[] args){//main method for the program
    
    Scanner myScanner;//initialize scanner object
    myScanner=new Scanner(System.in);//set variable for user input
    
// Cookies:
    System.out.print("Enter the number of cookies: ");//promt user for input
    if (!myScanner.hasNextInt()){//check for no integer
        System.out.print("You did not enter a valid positive integer.");//tell user they did it wrong
        return;//end program
    }//end if for cookies input
    int nCookies=myScanner.nextInt();//assign nCookies to user input
    if (nCookies<1){//check if cookies is greater than 0
        System.out.print("You need to enter an integer > 0.");//tell user they messed up
        return; //end program
    }// end if for cookies being positive
    
// People:
    System.out.print("Enter the number of people: ");//prompt user for input
    if (!myScanner.hasNextInt()){//check for no integer
        System.out.print("You need to enter a valid positive integer.");//tell them they messed up
        return;//end program
    }//end if for people input integer check
    int nPeople=myScanner.nextInt();//assign nPeople to user input
    if (nPeople<1){//check if the number of people is not positive
        System.out.print("You need to enter an integer > 0.");//tell the user to enter a positive integer
        return;//end program
    }//end if for people integer positive check
    
// Cookies per Person:
    System.out.print("Enter the number of cookies you want each person to get: ");//promt user for input
    if(!myScanner.hasNextInt()){//check for no integer
        System.out.print("You need to enter a valid positive integer.");//tell the user to enter an integer
        return;//end program
    }//end if for cookies per person integer check
    int cookiesPerPerson=myScanner.nextInt();//save user input of cookies per person into variable
    if (cookiesPerPerson<0){//if the number entered is negative
        System.out.print("You need to enter a positive number or 0.");//tell user to enter number [0,infinity)
        return;//end program
    }//end if for cookies being positive
        
// Using Information Gathered:
    double cookiesGiven=nCookies/nPeople;//find out how many cookies each person will get
    if (cookiesGiven>=cookiesPerPerson){//if there are enough cookies to that each person gets enough
        System.out.print("You have enough cookies for everyone");//tell the user there is enough
        double leftOver=nCookies-(cookiesPerPerson*nPeople);//find out if there are left over cookies
        if (leftOver==0){//if there are no left over cookies
            System.out.print(" and it will divide evenly.\n");//inform the user it will divide evenly
        }//end left over if
        else{//otherwise...
            System.out.print(", but they will not divide evenly.\n");//inform the user there will be leftover cookies
        }//end else for left over
    }//end if for "are there enough cookies"
    else{//otherwise
        System.out.print("You do not have enough cookies for everyone. ");//Tell the user there is not enough cookeis
        int nExtraCookies = (cookiesPerPerson * nPeople) - nCookies;//find out how many more cookies are needed
        System.out.print("You will need at least "+nExtraCookies+" more cookies!\n");//inform the user how many more they'll need
        return;//end program
    }//end else for not having enough cookies
    
    }//end main method
}//end class