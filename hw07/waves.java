// Timothy Berrill
// CSE 02 homework 7 (waves)
// Due on March, 17 of 2015
// This program will get a user input ranging from 1 to 30 and will output a wave pattern of numbers
// based on the user input, it will check to see if the user entered correct input. 
// It will create these waves of numbers three times, each time will be the same result
// however the first will be created with for loops, the next with while loops, and the one
// after with do-while loops.

import java.util.Scanner;//import scanner for user input

public class waves{//begin standard class (in all java programs)
    public static void main(String[] args){//begin main method of the program
  
    Scanner myScanner;//create scanner object
    myScanner= new Scanner(System.in);//choose myScanner as scanner object
    int number=0;//initialize varialbe for user input
    int counter=1;//create counter for later use
    
    while (true){//while loop for user input  
    System.out.print("Enter an int from 1 to 30: ");//prompt user for input
    if (!myScanner.hasNextInt()){//if there is no integer entered
        System.out.println("Please enter only an integer.");//tell the user to enter only integers
        myScanner.next();//move scanner along
        continue;//go back to top of loop
    }//end if for has no integer
    else{//otherwise (so if there IS an int entered)
        number=myScanner.nextInt();//assign number to value user entered
        if (number<1||number>30){//begin checking int if
            System.out.println("Input must be within range [1,30]");//tell user they messed up
            continue;
        }//end if for checking int
    }//end else for checking int
    break;//if they input is correct end the while loop
    }//end while loop for user input
    
//FIRST LOOP, THE FOR LOOP
    
    boolean up=false;//create boolean for up/down
    System.out.println("\nFor Loop:\n");//tell the user this is the for loop wave
    for (int x=1;x<=number;x++){//start main for loop
    
        if (up){
            for (int z=0;z<=counter;z++){//begin for loop
                for (int q=0;q<=z;q++){//begin for for individual line
                    System.out.print(""+x);//print out an x
                }//end for loop
                System.out.print("\n");//new line
            }//end second for loop in for loop section
            counter=counter+2;//add one to counter
            up=false;//change up
            }//end second for loop
        
        else if (!up){
            for (int z=counter;z>0;z--){//begin for loop
                for (int q=z;q>0;q--){//begin for loop for individual line
                    System.out.print(""+x);//print out an x
                }//end for loop
                System.out.print("\n");//new line
            }//end second for loop in for loop section
            up=true;//change up
        } //end if for first wave

    }//end main for loop


//SECOND LOOP, THE WHILE LOOP
    
    up=false;//create boolean for up/down
    System.out.println("\nWhile Loop:\n");//tell the user this is the for loop wave
    counter=1;//reset counter
    int x=1;//creat variable x to use in loops as counter
    
    while (x<=number){//begin overall while loop
    
        if (up){
            int z=0;//creat variable z to use as counter
                while (z<=counter){
                    int q=0;//creat variable q for counter in while loop
                    while (q<=z){//begin while loop for individual line
                        System.out.print(""+x);//print out an x
                        q++;//add one to counter
                    }//end while loop
                    System.out.print("\n");//new line
                    z++;//add one to z
                }//end second while loop in for loop section
            counter=counter+2;//add one to counter
            up=false;//change up
        }//end if for up loop
        
        else if (!up){
            int z=counter;//create variable z to use as counter
            while (z>0){
                int q=z;//creat variable q for counting
                while (q>0){//while loop for individual line
                    System.out.print(""+x);//print out an x
                    q--;//subtract one from counter
                }//end while loop
                System.out.print("\n");//new line
                z--;//subtract one from z
            }//end second while loop in for loop section
            up=true;//change up
        } //end if for first wave

        x++;//add one to counter
    }//end overall while loop
    
//THIRD LOOP, THE DO WHILE LOOP
    
    up=false;//create boolean for up/down
    System.out.println("\nDo-While Loop:\n");//tell the user this is the for loop wave
    counter=1;//reset counter
    x=1;//creat variable x to use in loops as counter
    
    do{
        if (up){
            int z=0;//creat variable z to use as counter
                do{//begin do-while
                    int q=0;//creat variable q for counter in while loop
                    do{//begin do while for individual line
                        System.out.print(""+x);//print out an x
                        q++;//add one to counter
                    }while (q<=z);//end do while for individual line
                    System.out.print("\n");//new line
                    z++;//add one to z
                }while (z<=counter);//end do
            counter=counter+2;//add one to counter
            up=false;//change up
        }//end if for up loop
        
        else if (!up){
            int z=counter;//create variable z to use as counter
            do{//begin down overall do-while loop
                int q=z;//creat variable q for counting
                do{//begin do-while loop for individual line
                    System.out.print(""+x);//print out an x
                    q--;//subtract one from counter
                }while (q>0);//end do-while loop for individual line
                System.out.print("\n");//new line
                z--;//subtract one from z
            }while (z>0);//end do loop
            up=true;//change up
        }//end if for down 

        x++;//add one to counter
    } while (x<=number);//end overall do while loop
    
    }//end main method
}//end standard class