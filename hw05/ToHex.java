// Timothy Berrill
// CSE02 Homework 5 (to hexidecimal)
// 2/24/15
// This program will take an RGB value provided by the user and convert it into
// hexidecimal form. The program will also check to see if the user inputed correct inputs
// (this will be integers ranging from 0 to 255)

import java.util.Scanner;//import the scanner for user input

public class ToHex{// main class for every java program
    public static void main(String[] args){
       
    Scanner myScanner;//Create object for scanner input
    myScanner=new Scanner(System.in);//use myScanner as input variable
    System.out.println("Please enter three numbers representing RGB values:");//prompt the user for input

// For the First input
  
    if (!myScanner.hasNextInt()){//if the number is NOT an integer
        System.out.println("Please enter only integers.");//tell the user to enter only integers
        return;//end the program
    }//end the if for red
    int red = myScanner.nextInt();//set red as the first input
    if (!(red>=0)||!(red<256)){//if red is not between 0 and 255
        System.out.println("Please enter only values between 0 and 255.");//tell the user they messed up
        return;//end the program
    }//end the if for red between 0 and 255
    
// For the second input

    if (!myScanner.hasNextInt()){//if the second input is NOT an integer
        System.out.println("Please enter only integers");//tell the user to only enter integers
        return;//end the program
    }//end the if for green
    int green=myScanner.nextInt();//set green as the second input
    if (!(green>=0)||!(green<256)){//if green is not between 0 and 255
        System.out.println("Please enter only values between 0 and 255.");//tell the user they need to enter values between 0 and 255
        return;//end the program    
    }//end the if for green between 0 and 255
 
// For the thrid input

    if (!myScanner.hasNextInt()){//if the thrid input is NOT an integer
        System.out.println("Please enter only integer");//tell the user to only enter integers
        return;//end the program
    }//end the if for blue
    int blue=myScanner.nextInt();//set blue as the third input
    if(!(blue>=0)||!(blue<256)){//begin if for blue between 0 and 256
        System.out.println("Please enter only values between 0 and 255.");//tell the user to enter values between 0 and 255
        return;//end the program
    }//end the if for blue being between 0 and 256

    System.out.print("The integer values are R:"+red+", G:"+green+", B:"+blue+", ");//print out the integer values 

// Convert "red" into hexidecimal
    
    int divide16=(int)(red/16);//find how many times 16 goes into red
    int remainder=(int)(red%16);//find the remainder when you do the division
    String digit1red=""+divide16;
    String digit2red=""+remainder;
    switch(divide16){//begin switch for first digit in hexidecimal for red
    case 15://if it's 15
        digit1red="F";//set the first digit to F
        break;//break out of the switch
    case 14://if it's 14
        digit1red="E";//set the first digit to E
        break;//break out of the switch
    case 13://if it's 13
        digit1red="D";//set the first digit to D
        break;//break out of the switch
    case 12://if it's 12
        digit1red="C";//set the first digit to C
        break;//break out of the switch
    case 11://if it's 11
        digit1red="B";//set the first digit to B
        break;//break out of the switch
    case 10://if it's 10
        digit1red="A";//set the first digit to A
        break;//break out of the switch
    }//end switch for first digit in red
    switch (remainder) {//begin switch for second digit in hexidecimal for red
    case 15://if its 15
        digit2red="F";//set the first digit to F
        break;//break out of the switch
    case 14://if its 14
        digit2red="E";//set the first digit to E
        break;//break out of the switch
    case 13://if its 13
        digit2red="D";//set the first digit to D
        break;//break out of the switch
    case 12://if its 12
        digit2red="C";//set the first digit to C
        break;//break out of the switch
    case 11://if its 11
        digit2red="B";//set the first digit to B
        break;//break out of the switch
    case 10://if its 10
        digit2red="A";//set the first digit to A
        break;//break out of the switch
    }//end the switch for second digit in red
    System.out.print("This is represented in hexidecimal by: "+digit1red+digit2red);//print out what red is in hexidecimal
    
// Convert "green" into hexidecimal
    
    divide16=(int)(green/16);//find how many times 16 goes into green
    remainder=(int)(green%16);//find the remainder when you do the division
    String digit1green=""+divide16;
    String digit2green=""+remainder;
    switch(divide16){//begin switch for first digit in hexidecimal for green
    case 15://if it's 15
        digit1green="F";//set the first digit to F
        break;//break out of the switch
    case 14://if it's 14
        digit1green="E";//set the first digit to E
        break;//break out of the switch
    case 13://if it's 13
        digit1green="D";//set the first digit to D
        break;//break out of the switch
    case 12://if it's 12
        digit1green="C";//set the first digit to C
        break;//break out of the switch
    case 11://if it's 11
        digit1green="B";//set the first digit to B
        break;//break out of the switch
    case 10://if it's 10
        digit1green="A";//set the first digit to A
        break;//break out of the switch
    }//end switch for first digit in green
    switch (remainder) {//begin switch for second digit in hexidecimal for green
    case 15://if its 15
        digit2green="F";//set the first digit to F
        break;//break out of the switch
    case 14://if its 14
        digit2green="E";//set the first digit to E
        break;//break out of the switch
    case 13://if its 13
        digit2green="D";//set the first digit to D
        break;//break out of the switch
    case 12://if its 12
        digit2green="C";//set the first digit to C
        break;//break out of the switch
    case 11://if its 11
        digit2green="B";//set the first digit to B
        break;//break out of the switch
    case 10://if its 10
        digit2green="A";//set the first digit to A
        break;//break out of the switch
    }//end the switch for second digit in green
    System.out.print(digit1green+digit2green);//add what green is in hexidecimal
    
// Convert "blue" into hexidecimal
    
    divide16=(int)(blue/16);//find how many times 16 goes into blue
    remainder=(int)(blue%16);//find the remainder when you do the division
    String digit1blue=""+divide16;
    String digit2blue=""+remainder;
    switch(divide16){//begin switch for first digit in hexidecimal for blue
    case 15://if it's 15
        digit1blue="F";//set the first digit to F
        break;//break out of the switch
    case 14://if it's 14
        digit1blue="E";//set the first digit to E
        break;//break out of the switch
    case 13://if it's 13
        digit1blue="D";//set the first digit to D
        break;//break out of the switch
    case 12://if it's 12
        digit1blue="C";//set the first digit to C
        break;//break out of the switch
    case 11://if it's 11
        digit1blue="B";//set the first digit to B
        break;//break out of the switch
    case 10://if it's 10
        digit1blue="A";//set the first digit to A
        break;//break out of the switch
    }//end switch for first digit in red
    switch (remainder) {//begin switch for second digit in hexidecimal for blue
    case 15://if its 15
        digit2blue="F";//set the first digit to F
        break;//break out of the switch
    case 14://if its 14
        digit2blue="E";//set the first digit to E
        break;//break out of the switch
    case 13://if its 13
        digit2blue="D";//set the first digit to D
        break;//break out of the switch
    case 12://if its 12
        digit2blue="C";//set the first digit to C
        break;//break out of the switch
    case 11://if its 11
        digit2blue="B";//set the first digit to B
        break;//break out of the switch
    case 10://if its 10
        digit2blue="A";//set the first digit to A
        break;//break out of the switch
    }//end the switch for second digit in blue
    System.out.println(digit1blue+digit2blue);//add what blue is in hexidecimal
    }//End end of the main method
}//End the main class