// Timothy Berrill
// CSE 02 lab 8 (factorials)
// 3/20/15
// This program will calculate "super factorials" using two additional mehtods
// (super factorials 3!+2!+1! ect)

import java.util.Scanner;//import scanner for user input
public class Factorials{// begin the main class in every java program

    public static int factorial(int n){//begin factorial method
        int x=1;//storing the calculated factorial
        for(int q=1;q<=n;q++){//begin for loop for calculation
            x=x*q;//caclulate the factorial using for loop
        }//end of the for loop for factorials
        return x;//return the value of x
    }//end method for factorials
    
    public static void print(int n){//begin printing method
        System.out.print("The super factorial is equal to "+n);//print out the super factorial
    }//end method for printing
    
    public static void main(String[] args){//main method of the program
        Scanner myScanner;//create scanner object
        myScanner=new Scanner(System.in);//create memory space and stuff for scanner object
        System.out.print("Enter an integer to get the super factorial: ");//prompt the user for input 
        int n=myScanner.nextInt();//store user input into variable n
        int total=0;//create variable total to store the super factorial 
        for (n=n;n>0;n--){//go through each value of n as n goes down by one until it reaches 0
            total+=factorial(n);//add to total each individual factorial value of n
            System.out.println(factorial(n));//print out each value
        }//end for loop for creating super factorial
        print(total);//print out the total
    }//end of the main method
    
}//end of main class