// Timothy Berrill
// CSE 02 Homework 6 (Make symbols)
// 2/3/15
// This program will use a do-while loop and a random number generator to generate and integer
// between 0 and 100. It will print out the number generated. If the number is even is will print
// out that number of " * " characters, if the number is odd it will print out that number
// of " & " characters.

public class MakeSymbols{//begin standard class in every java progra,
    public static void main(String[] args){//begin main method of the program
    
    int random=(int)(Math.floor(Math.random()*100));//create a random number from 1 to 100
    System.out.println("Random nmber generated: "+random);//print out the number generated
    System.out.print("The output pattern: ");//print out the beginning for the output pattern
    if(random%2==0){//if even
        do{//begin do
            System.out.print("*");//print out one thing in the pattern
            random-=1;//subtract one from random number
        }//end do
        while(random>0);//while random is positive
    }//end if even
    else{//if odd
        do{//begin do
            System.out.print("&");//print out one thing in the pattern
            random-=1;//subtract one from random number
        }//end do
        while(random>0);//while random is positive
    }//end else
    System.out.print("\n");//new line
    }//end the main method of the program
}// end standard class