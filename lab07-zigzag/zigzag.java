// Timothy Berrill
// CSE 02 lab 7 (zig zag)
// 2/6/15
// This program will use a while loop and break statement to create
// various **** patterns

import java.util.Scanner;//import scanner for user input

public class zigzag{//begin standard java class
    public static void main(String[] args){//begin main method
    
    Scanner myScanner;//create scanner object
    myScanner=new Scanner(System.in);//use myscanner as scanner object
    int nStars=10;//create variable for number of stars
    
    while (true){//begin while loop
    
        while (true){//begin while
            System.out.print("Enter an int between 3 and 33: ");//prompt user for input
            if (!myScanner.hasNextInt()){//check if there is no int
                System.out.println("Please enter only an int.");//tell the user what to enter
                myScanner.next();//move scanner along
                continue;//go to top of loop
            }//end if
            else{//begin else
                nStars=myScanner.nextInt();//store input into nStars
                if (nStars<3||nStars>33){//begin if
                    System.out.println("Number is out of range [3,33]");//tell the user what to enter 
                    continue;//go to top of loop
                }//end if
            }//end else
            break;//if input is valid then break
        }//end while
        int counter=1;//create counter
    
        for (int x=0;x<nStars;x++){//begin for loop for printing stars
            System.out.print("*");//print out a star
        }//end for loop for printing stars
        System.out.print("\n");//next line
        
        for (int x=0;x<nStars-2;x++){//begin for loop for printing stars
            for (int z=0;z<counter;z++){//begin for loop for printing out spaces
                System.out.print(" ");//print out a space
            }//end for loop for printing spaces
            System.out.println("*");//print out a star
            counter+=1;//add one to counter
        }//end for loop for printing stars
            
        for (int x=0;x<nStars;x++){//begin for loop for printing stars
            System.out.print("*");//print out a star
        }//end for loop for printing stars
        
        System.out.print("\nEnter y or Y to go again: ");//prompt user for input
        String Yory=myScanner.nextLine();//store input into variable Yory
        Yory=myScanner.nextLine();//store input
        switch (Yory){//begin switch
        case "y":
        case "Y"://if the user enters y or Y
            continue;//do the loop again
        default://otherwise
            return;//end the loop 
        }//end switch
    }//end while loop
    }//end main method
}//end class