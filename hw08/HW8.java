// Timothy Berrill
// CSE 02 Homework 8 (game)
// March 24th 2015
// This is a program that will use various overloaded methods to play a game with the user
// it will use string comparisions in the methods to find out what the player wants to do
// next in the game

import java.util.Scanner;//import scanner
public class HW8{//main class
public static String getInput(Scanner scan, String string){//begin get input method
    string=scan.nextLine();//get user input store in string
    switch (string){//begin switch for string entered by user
        case "c"://if user enters c
        case "C"://case C
            return(" ");//return blank string to continue
        default://defaul case
            System.out.println("Yeah right loser!");//tell them they're a loser
            System.exit(0);//exit the program
            return(" ");//return value
    }//end switch statement 
}//end getInput for scanner and string

public static String getInput(Scanner scan, String string, int trial){//begin method for getInput
    while (trial>0){//while the trial is greater than 0
        string=scan.nextLine();//get input from user
        switch (string){//begin switch for input
            case "a":
            case "A":
                double random=Math.random();//create random number
                if (random>.5){System.out.println("Critical hit!");// a hit
                    trial-=1;//subtract one from trial
                }//end if for a hit
                else {System.out.println("Gosh! You missed it!");}//otherwise its a miss
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                continue;//continue
            case "E":
            case "e":
                random=Math.floor(Math.random()*(10)+1);//create number from one to ten
                if (random==10){System.out.println("You have escaped!");//if random is ten
                    System.exit(0);//end the program
                }//end if
                else{//otherwise
                    System.out.println("You failed to escape!\nEnter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    continue;}//otherwise continue
                return(" ");//return blank
            default:
                System.out.println("Executed by the GIANT! Game over!");//tell them they lost
                System.exit(0);//exit
                return(" ");//return blank
        }//end switch
    }//end while loop
    return(" ");//return nothing
}//end method
public static String getInput(Scanner scan){//begin get input method
    String string=scan.nextLine();//get user input
    switch(string){//begin switch for string
        case "1"://first case
            System.out.print("Congratulations! You got free chewing gum for life ");//tell the hero what they got
            return(" ");//return nothing
        case "2"://second case
            System.out.print("Congratulations! You got a 4.0 gpa ");//tell the hero what they got
            return(" ");//return nothing
        case "3"://third option
            System.out.print("Congratulations! You got 100,000 coins ");//tell the hero what they got
            return(" ");//return nothing
        default://default case
            System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");//tell them to restart
            System.exit(0);//exit
    }//end switch
    return(" ");//return nothing
}//end 
public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
}//end main class