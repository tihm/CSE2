// Timothy Berrill
// CSE 02 homework 12 (multiply arrays)
// April 21st, 2015
// This program will ask the user for 2 heights/widths and will check to see if
// matricies can be multiplied with those heights and widths. If they can it'll multiply them
// and if not it will inform the user it can't.


import java.util.Scanner;
import java.util.Random;
public class Multiply{//begin class

public static int[][] randomMatrix(int height, int width){//begin method for matrix creation
    int [][] matrix=new int[height][width];//create matrix (array in an array)
    Random random = new Random();//create new random object for random use
    for (int z=0;z<height;z++){//for loop to loop through height of matrix (for row major format)
        for (int x=0;x<width;x++){//for loop for the width
            matrix[z][x]=random.nextInt(21)-10;
        }//end for loop
    }//end for loop
    return matrix;
}//end method for random matrix creation

public static void printMatrix(int[][] matrix){//begin print method
    for (int z=0;z<matrix.length;z++){//for loop to loop through height of matrix (for row major format)
        System.out.print("[");//print out bracket for proper form
        for (int x=0;x<matrix[0].length;x++){//for loop for the width
            System.out.print(" "+matrix[z][x]+" ");//print out value
        }//end for loop
        System.out.println("]");//print out bracket for proper form
    }//end for loop
}//end of print method

public static int[][] multiplyMatrix(int[][] matrix1,int[][] matrix2){
    if (!(matrix1.length==matrix2[0].length)||!(matrix1[0].length==matrix2.length)){//if not compatible
        System.out.println("Matrices not compatibile for multiplication.");//tell the user
        return null;//return nothing
    }//end check for compatibility
    int[][] newMatrix=new int[matrix1.length][matrix2[0].length];//create matrix for multiplication
    int sum=0;
    for (int x=0;x<matrix1.length;x++){
        for (int y=0;y<matrix2[0].length;y++){
            for (int z=0;z<matrix2.length;z++){
                sum+=(matrix1[x][z]*matrix2[z][y]);
            }
        newMatrix[x][y]=sum;//yay
        sum=0;
        }
    }
    return newMatrix;
}//end the multiplication method

public static void main(String[] args){//begin main method
    int [] array = new int[4];//use to store user input
    int x=0;//for prompt use
    int z=0;//user for storing user input
    Scanner myScanner=new Scanner(System.in);
    String[] prompt={" height "," first ", " width "," first "," height "," second "," width "," second "};//use for prompts
    
    System.out.print("Press enter to begin.");//have user press enter to begin
    while(true){//loop for checking compatibility
        x=0;z=0;//reset counters
        while (x<8){//while loop for input
            myScanner.nextLine();//go the the next input
            System.out.println("Enter"+prompt[x]+"for the"+prompt[x+1]+" array: ");//prompt user
            if(!myScanner.hasNextInt()){//if ther is no int entered
                System.out.println("Please enter only ints.");//tell the user to enter only ints
                continue;}//continue the loop
            array[z]=myScanner.nextInt();//store input into array for user input storage
            if (array[z]<1){//if the input is less than one
                System.out.println("Only enter an int that is greater than 0.");//tell user they messed up
                continue;}//end check for less than one & continue the loop
            else{
            x+=2;//add one to prompt thing
            z+=1;}//add one to counter
        }//end while loop for input
        if (array[0]==array[3]&&array[1]==array[2]){
            break;//end the loop
        }//end check if they are compatible
        else{
            System.out.println("Matrices are not compatible for multiplication.");//tell the user to try again
        }//end else
    }//end bigger while loop
        
    int[][] matrix1=randomMatrix(array[0],array[1]);//create array with first width and height
    System.out.println("\nThe first matrix: ");//for the first one
    printMatrix(matrix1);//print out the first matrix
    int [][] matrix2=randomMatrix(array[2],array[3]);//create another array out of the second width and height
    System.out.println("\nThe second matrix: ");//for the second one
    printMatrix(matrix2);//print the second matrix
    int[][] newMatrix=multiplyMatrix(matrix1,matrix2);//multiply the matricies 
    System.out.println("\nThe multiplied matrix: ");
    printMatrix(newMatrix);
}//end math method

    
}//end of the class