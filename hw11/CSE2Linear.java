// Timothy Berrill
// CSE 02 homework 11 (the cse linear grade finder thing)
// April 14th, 2015
// This program furthers the work on searching through singular dimensional arrays

import java.util.Scanner;//import scanner for user input
import java.util.Random;//used for random purposes

public class CSE2Linear{//begin class 
    
    public static void main(String[] args){//begin main method
        
        Scanner myScanner = new Scanner(System.in);//create new scanner object
        int currentint = 0; int lastint = 0;//create variables for storing ints
        int[] CSEgrades = new int[15];//create array "CSEgrades"
        System.out.println("Please enter 15 ints for grades in CSE02: ");//prompt user to enter ints
       
        for (int x=0; x<15; x++){//this will be used to go through each position in the array
        
            if (!myScanner.hasNextInt()){//check if the user didn't enter an int
                System.out.println("You need to enter only ints.");
                return;}//tell the user to only enter ints
            currentint=myScanner.nextInt();//store int input into currentint
            
            if (currentint<0||currentint>100){//check if the input is greater than 0
                System.out.println("Please only enter positive ints less than 100.");
                return;}//tell user to enter only positive ints
                
            if (lastint>currentint){//check if this input is less than the last one
                System.out.println("Please make each input larger than the last.");
                return;}//tell the user to make ints increasing
                
            CSEgrades[x] = currentint;
            lastint = currentint;
            
        }//end for loop through array
        
        System.out.print("The stored grades are: ");//start to print grades
        for (int x=0; x<15; x++){System.out.print(CSEgrades[x]+" ");}//print each grade out
        
        System.out.print("\nEnter a grade to be searched for: ");//prompt user
        int target = myScanner.nextInt();//store input into target
        FindNumberBinary(target, CSEgrades);
        
        Scramble(CSEgrades);
        System.out.print("\nScrambled:\nThe stored grades are: ");//start to print grades
        for (int x=0; x<15; x++){System.out.print(CSEgrades[x]+" ");}//print each grade out
        
        System.out.print("\nEnter a grade to be searched for: ");//prompt user
        target = myScanner.nextInt();//store input into target
        FindNumberLinear(target, CSEgrades);
        
    }//end main method
    
    
    public static void FindNumberBinary(int target, int[] array){//begin find number method
        int upper=14; int lower=0;//create upper and lower bounds
        int index = ((upper+lower)/2);//create index for search
        int counter=1;
        
        while (!(array[index]==target)&&(lower<=upper)){//while the target has not been found and there's room for more search
            if(array[index]>target){//if number being checked is greater than the target
                upper=index-1;}//adjust upper bound
            else{lower=index+1;}//otherwise adjuct lower bound
            index = ((upper+lower)/2);//adjust index
            counter++;
        }//end while loop for search
        
        if (array[index]==target){//if it was found
            System.out.println(target+" was found in the list with "+counter+" iterations.");}//tell the user
        else{System.out.println(target+" was not found in the list with "+counter+" iterations.");}//tell the user otherwise
        return;//return to main method
    }//end of find number method
    
    
    
    public static void FindNumberLinear(int target, int[] array){//find the number
        int counter=0;
        for(int x=0; x<15; x++){//begin for loop for array
            counter++;
            if (array[x]==target){//if the number was found
                System.out.println(target+" was found in list with "+counter+" iterations.");//tell user it was found
                return;
            }//end if
        }//end for loop
        System.out.println(target+" was not found in list with "+counter+" iterations");//tell user it was not found
        return;
    }//end method for find number linear
    
    
    
    
    public static void Scramble(int[] array){//begin scramble method
        Random random=new Random();//create new random thing
        int savedint=0;int randomindex=0;
        for (int x=0; x<15; x++){//begin for loop through array
            savedint=array[x];//store first number
            randomindex=random.nextInt(15);//create random number
            array[x]=array[randomindex];//do the switch
            array[randomindex]=savedint;//switch
        }//end for loop of scramble
    }//end scramble method
    
    
}// end class