//Timothy Berrill
// lab 11

import java.util.Scanner;
import java.util.Random;
public class DoubleArray{
    
    public static void main(String[] args){
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        
        for (int x=0;x<array1.length;x++){
            array1[x] = random.nextInt(100);
        }//end of filling first array
        int blah = random.nextInt(100);
        array2[0]=blah;
        for (int x=1;x<array2.length;x++){
            do{
                blah = random.nextInt(100)+array2[x-1];
            }while(array2[x-1]>blah);
            array2[x]=blah;
        }//end of filling second array
        
        int min=100; int max=0;
        for (int x=0;x<array1.length;x++){
            if (array1[x]>max){max=array1[x];}
            if (array1[x]<min){min=array1[x];}
        }//end of linear search for min and max
        System.out.println("The maximum of array1 is "+max);
        System.out.println("The minimum of array1 is "+min);
        System.out.println("The maximum of array2 is "+array2[49]);
        System.out.println("The minimum of array2 is "+array2[0]);
        
        System.out.print("Enter an int: ");
        if (!myScanner.hasNextInt()){
            System.out.print("You did not enter an int.");
            return;}//end if check for int
        int number = myScanner.nextInt();
        if (number<0){
            System.out.println("You must enter an int > 0.");
            return;}//end if for checking int > 0 

        int lower=0;
        int upper=array2.length;
        int index=((lower+upper)/2);
        boolean found = false;
        while (!(array2[index]==number)&&lower<=upper){
            if (array2[index]>number){
                upper=index-1;}
            else{lower=index+1;}
            index=((lower+upper)/2);
            }//end while
            if (array2[index]==number){
                System.out.println("The number was found in the array at position "+index);
            }//end if
            else{
                System.out.println("The number was not found.");
                System.out.println("The number above the key is "+array2[index+1]);
                System.out.println("The number below the key is "+array2[index]);
            }//end else

    }//end of main method
}//end of main class