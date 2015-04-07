// TImothy Berrill
// Lab 10 with arrays input

import java.util.Scanner;
public class ArrayInputs{

    public static int positiveint(Scanner myScanner){
        if (!myScanner.hasNextInt()){
            System.out.println("You didn't enter an int.");
            return -1;
        }//end if
        int value=myScanner.nextInt();
        if (value>0){
            return (value);
        }//end if
        else {
            System.out.println("You didn't enter a postive nubmer.");
            return -1;
        }
    }// end positiveint 
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int number = myScanner.nextInt();
        int[] array = new int[number];
        myScanner.nextLine();
        for (int i=0;i<number;i++){
            while (true){
                System.out.print("Please enter a postive integer: ");
                int input=positiveint(myScanner);
                if (input==-1){
                    myScanner.nextLine();
                }//end if
                else{
                    array[i]=input;
                    break;
                }//end else
        }//end while
        }//end for
        System.out.println("\nYour array is:");
        for (int i=0; i<number; i++){
            System.out.println(array[i]);
        }//end for
    }// end main method
}