// Timothy Berrill
// CSE02 Homework 6 (Get Integers)
// 2/3/15
// This program will ask the user for 5 non-negative integers and print out th esum of the 5 integrs.
// If the user enters invalid input the program will ask the user for an input again.

import java.util.Scanner;// import scanner for user input

public class GetIntegers{//main class in every java program
    public static void main(String[] args){//main method for the program
    
    Scanner myScanner; //initialize scanner object
    myScanner=new Scanner(System.in);//set variable for scanner use
    int[] array = new int[5];//create array called array that has room for 5 variables
    int number=0;//create new variable for numbers
    int x=0;//counter for while loop
    
    System.out.println("Please enter 5 non-negative integers: ");//prompt user for input
    while (x<5){//begin while loop for getting user input
    
        if (myScanner.hasNextInt()){//check if the user didn't entered an integer 
            number=myScanner.nextInt();//save input to number
            if (number<0){//if the input was negative
                System.out.println("Invalid input, enter again.");//tell the user to re-enter a number
            }//end if
            else{//otherwise
            array[x]=number;//add the input to the array
            x++;//add one to counter
            continue;//do the loop again
            }//end else
        }//end if for checking input
        
        if (!myScanner.hasNextInt()){//otherwise
            myScanner.next();//clear scanner stuff
            System.out.println("Invalid input, enter again.");//tell the user to re-enter a number
        }//end else for if
        
    }//end while loop for getting user input
    number=0;//reset number
    for(x=0;x<5;x++){//second for loop for running through array
        number+=array[x];//add to "number" the next value in array
    }//end for loop
    System.out.println("Sum is "+number);//print out the sum
    }//end main method
}// end main class