// Timothy Berrill
// CSE02 lab 9 (random sentence)
// March 27th, 2015
// This program will create four methods that correspond to different kinds
// of words, then it will call on those methods to create sentneces from
// random words by using a random number generator. It will ask the user
// if they would like to have another sentence and repeat if they do.
// Otherwise the program will end.

import java.util.Random;//import random utility
import java.util.Scanner;//import the scanner

public class RandomSentence{//begin main class

public static void main(String[] args){//begin main method of the program
    Scanner myScanner = new Scanner(System.in);//create new scanner object
    String yesORno=" ";//create empty string to store stuff in
    while (true){//begin while loop, repeat until break statement
        System.out.println("The "+adjective()+" "+adjective()+" "+noun()+
        " "+verb()+" the "+adjective()+" "+noun()+".");
        //(above) call methods and print random sentence
        System.out.println("Would you like another sentence? Enter y or Y for yes and anything else for no: ");
        //(above) prompt user if they would like another sentence
        yesORno=myScanner.nextLine();//read user input
        switch (yesORno){//begin switch for user input
            case "y"://if y
            case "Y"://if Y (if either of these cases...)
                continue;//continue to the begining of the loop
            default://otherwise
                break;//if not Y or y then end the loop
        }//end switch statement for user input
        break;//end the while loop
    }//end the while loop for the main method
}//end the main method of the program

public static String adjective(){//begin adjective method
    Random random=new Random();
    int number=random.nextInt(10);//create random int from 0 to 10
    switch (number){//begin switch for choosing the adjective
        case 0://adjective 0
            return ("old");// use the word "old"
        case 1://adjective 1
            return ("lazy");// use word "lazy"
        case 2://adjective 2
            return ("tastey looking");// use phrase "tastey looking"
        case 3://.....ect as for all other cases
            return ("sad");
        case 4:
            return ("lonely");
        case 5:
            return ("talkative");
        case 6:
            return ("unintelligent");
        case 7:
            return ("quirky");
        case 8:
            return ("absurd");
        case 9:
            return ("slow");
    }//end switch
    return(" ");
}//end method for adjective

public static String verb(){//begin method for verb selection
    Random random=new Random();
    int number=random.nextInt(10);//create random int from 0 to 10
    switch (number){//begin switch for choosing the verb
        case 0:
            return ("jumped past");
        case 1:
            return ("strangled");
        case 2:
            return ("cried on");
        case 3:
            return ("sabotaged");
        case 4:
            return ("hunted down");
        case 5:
            return ("mind controlled");
        case 6:
            return ("ate");
        case 7:
            return ("stepped on");
        case 8:
            return ("befriended");
        case 9:
            return ("insulted");
    }//end switch
    return(" ");
}//end method for verb

public static String noun(){//begin method for noun selection
    Random random=new Random();
    int number=random.nextInt(10);//create random int from 0 to 10
    switch (number){//begin switch for choosing the noun
        case 0:
            return ("man");
        case 1:
            return ("cabbage");
        case 2:
            return ("truck");
        case 3:
            return ("bull frog");
        case 4:
            return ("bumble bee");
        case 5:
            return ("soda can");
        case 6:
            return ("whale");
        case 7:
            return ("trash can");
        case 8:
            return ("athlete");
        case 9:
            return ("towel");
    }//end switch
    return(" ");
}//end method for noun

}// end the main class