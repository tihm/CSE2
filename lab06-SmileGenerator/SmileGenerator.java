// Timothy Berrill
// CSE 02 lab 6 (Smile Generator)
// 2/27/15
// This program will create a series of 5 smiley faces using non nested loops.
// It will first create the smiles using "for" loops, then it will while loops, and do-while loops.
// Then it will generate a random number of smiles from 1 to 100.
// Next it will limit the number of smiles to 30 per line
// It will then print one additional smile for each line 

public class SmileGenerator{//main class in every java program
    public static void main(String[] args){//main method for the program
 
// STEP ONE   
    int x=0;//initialize x as generic counter
    for(x=0;x<5;x++){//begin for loop for 1st 5 smiles
        System.out.print(":)");//print out a smile each time it goes throught the loop
    }//end for loop for first 5 smiles   
    
    System.out.print("\n");//go to a new line
    x=0;//reset counter
    while (x<5){//begin while loop for step one
        System.out.print(":)");//print the smiley
        x++;//add one to x
    }//end while loop for STEP ONE
    
    System.out.print("\n");//new line
    x=0;//reset counter
    do {//begin do for step one
        System.out.print(":)");//print out smile
        x++;//add one to x counter
    }//end do
    while(x<5);//while counter is less than 4
    
// STEP TWO
    System.out.print("\n\n");//new line
    int nSmiles=(int)(Math.floor(Math.random()*100)+1);//create a random number from 1 to 100
    for(x=0;x<=nSmiles;x++){//begin for loop for step two, from 0 to nSmiles
        System.out.print(":)");//print out a smile
    }//end for loop for STEP TWO
    
// STEP THREE   
    System.out.print("\n\n");//new line
    nSmiles=(int)(Math.floor(Math.random()*100)+1);//create a NEW random number from 1 to 100
    int z=1;//initialize new variable for counting sets of 30
    for(x=0;x<=nSmiles;x++){//begin for loop for step three
        if((int)(x/(30*z))==1){//if the number of smiles printed is a multiple of 30
            System.out.print("\n");//go to a new line
            z++;//add one to the counter of sets of 30
        }//end if for step three
        System.out.print(":)");//print out a smiley
    }//end for loop for step three
    
// STEP FOUR
    System.out.print("\n\n");//new line
    nSmiles=(int)(Math.floor(Math.random()*100)+1);//create a NEW random number from 1 to 100
    int nSmilesPerLine=1;// the other counter for smiles per line
    int smilesThisLine=0;//another counter for current smiles on the line
    for(x=0;x<=nSmiles;x++){//begin four loop for step four
        if (smilesThisLine!=nSmilesPerLine){//if the smiles are not at the designated line length yet
            System.out.print(":)");//print out a smiley
            smilesThisLine++;//add one to line counter
        }//end the if
        else{//otherwise
            System.out.print("\n");//go to a new line
            nSmilesPerLine++;//add one to the number of smiles per line counter
            smilesThisLine=0;//reset smiles per line
        }//otherwise new line
     
    }//end for loop for step four
    }//end of the main method
}//end of the main class