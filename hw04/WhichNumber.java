// Timothy Berrill
// CSE 02 Homework 4 (Which Number?)
// 2/17/15
// This program will go through a series of logical steps to guess which number
// the user is thinking of between one and ten. It will also check for valid user input

import java.util.Scanner; //import scanner for user input

public class WhichNumber{//standard class in all java programs
    public static void main(String[] args){//main method for program
    
    Scanner myScanner;//initialize scanner object
    myScanner=new Scanner(System.in);//set variable for user input
    
    System.out.print("Think of a number between 1 and 10 inclusive.\n"+
    "Is your number even (Enter y/Y for yes and n/N for no)?: ");//Tell user to think of number, and ask if it's even
    String isEvenS=myScanner.nextLine();//stores user input into "isEvenString" variable
    
// This section of code checks for whether the number is even and saves it in a boolean variable to use later
    boolean isEven;//initialize isEven variable
    switch (isEvenS){//begin switch statement for isEvenString
    case "y":
    case "Y":// if the input is either Y or y (if y it'll fall through to case 4)
        isEven=true;//set isEven to true
        break;//exit switch
    case "n":
    case "N"://if the input is either n or N (if n it'll farll through to case 4)
        // The second thing to check is its diviability by 3, regardless whether or not its even or odd
        isEven=false;//set isEven to false
        break;//break out of switch 
    default://default option
        System.out.print("not valid input");//tell the user the input is not valid
        return;//end program
    }//end switch for "isEven" 
    
// The second thing to check is its diviability by 3 and goes back to check whether it was also even or odd (yeilding for results:
// Even+divisable by 3, Not even + divisable by 3, even + not divisable by 3, not even + not divisable by 3)
    System.out.print("Is your number divisable by 3?: ");//prompt user for is divisable by 3?
    String isDivisable3=myScanner.nextLine();//store user input into "isDivisable3"
        
    switch (isDivisable3+isEven){//begin switch for 3 divisability (also checking for whether or not its even or odd)
    
    case "y"+true:
    case "Y"+true://if the number is BOTH even and divisable by three
        System.out.print("The number is 6!");//tell the user the number must be 6
        break;//break out of the switch (end the program!)
        
    case "n"+true:
    case "N"+true://if the number is not divisable by three and even:
        System.out.print("Is your number divisable by 4?: ");//prompt user to see if the number is divisable by 4
        String isDivisable4=myScanner.nextLine();//store user input into "is divisable 4"
        switch (isDivisable4){//begin switch for 4 divisability
        case "y":
        case "Y"://if divisable by four (both cases of y and Y)
            System.out.print("Is the number divided by 4 greater than 1? ");//prompt user for whether the number is 8 or 4
            String is8or4=myScanner.nextLine();//store user input into "is8or4" as string
            switch (is8or4){//begin switch for is 8 or 4
            case "y":
            case "Y"://if yes, then the number is eight
                System.out.print("The number you're thinking of is 8!\n");//tell the user their number is eight
                return;//end the program
            case "n":
            case "N"://if no, then the number is definitely 4
                System.out.print("the number you're thinking of is 4!\n");//tell the user their number is four
                return;//end the program
            default://default case
                System.out.print("That was not a valid input!\n");//tell the user their input was not valid
                return;//end the program
            }//end switch for is 8 or 4 (program will end at this point because all options end in a RETURN)
            
        case "n":
        case "N"://if NOT divisable by four (both cases for n and N)
            System.out.print("Is it divisable by 5?: ");//prompt user for whether its divisable by 5
            String is10or2=myScanner.nextLine();//save input into "is10or2"
            switch (is10or2){//begin switch for is 10 or 2
            case "y":
            case "Y"://if the answer is yes, the number is 10
                System.out.print("The number is 10!\n");//tell the user their number is ten
                return;//end the program
            case "n":
            case "N"://if the answer is no, the number is 2
                System.out.print("The number is 2!\n");//tell the user their number is two
                return;//end the program
            default://default option
                System.out.print("That was not a valid input!\n");//tell the user thir input is not valid
                return;//end the program
            }//end switch for is 10 or 2 (program will end because options end in a return)


        default://default case
            System.out.print("Not valid input!\n");//tell user the input is wrong
            return;//exit program
            
        }//end switch for 4 divisablity Program will end because all options end in a return
        
    case "n"+false:
    case "N"+false:// This is the case where the number is not divisable by three, and it is not even
        System.out.print("Is it greater than 6?: ");//ask the user if its greater than 6
        String greater6=myScanner.nextLine();//save the input into "greater6"
        switch (greater6){//begin switch for greater than 6?
        case "y":
        case "Y"://if the number is greater than 6, it is definitely 7
            System.out.print("The number you're thinking of is 7.\n");//tell the user the number is 7
            return;//end the program
        case "n":
        case "N"://if the number is less than 6 it will either be 1 or 5
            System.out.print("Is the number less than 3?: ");//ask if the number is less than three
            String is1or5=myScanner.nextLine();//save the input into variable is1or5
            switch (is1or5){//begin switch for is one or five
            case "y":
            case "Y"://if the number is less than three it is one
                System.out.print("The number you're thinking of is 1!\n");//tell them the number their thinking of is 5
                return;//end the program
            case "n":
            case "N"://if the number is greater than 3 it is 5
                System.out.print("The number you're thinking of is 5!\n");//Tell them their number is 1
                return;//end the program
            default://default program
                System.out.print("That was not a valid input!\n");//tell the user their input is bad
                return;//end the program
            }//end switch for is one or five at this point the program will end because all options end in return
        }//end switch for greater 6
        
    case "y"+false:
    case "Y"+false://This is the case where the number is divisable by three, and is an odd number
        System.out.print("When divided by 3 is the result greater than 1?: ");//ask whether it is 9 or 3
        String is9or3=myScanner.nextLine();//save the user input into variable is9or3
        switch (is9or3){//begin switch for 9 or 3
        case "y":
        case "Y"://if the result is greater than 1 then the number is 9
            System.out.print("The number is 9!\n");//tell the user their number is 9
            return;//end the program
        case "n":
        case "N"://if the result is one then the number is 3
            System.out.print("The number is 3!\n");//tell the user their number is 3
            return;//end the program
        default://the default option
            System.out.print("That was not a valid input...\n");//inform the user their input was not valid
            return;//end the program
        }//end switch for is 9 or three program will be over now because all options end in return
        
    default://default option
        System.out.print("That input is not valid!\n");//tell user the input is not valid
        return;//end program
    }//end switch for 3 divisability
    }//end of main method
}//end class