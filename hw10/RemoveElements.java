// Timothy Berrill
// CSE02 hw 10 (remove elements)
// April 7th, 2015

import java.util.Random;
// The following is given code:
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]\n");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }

// End of given code

public static int[] randomInput(){//begin method
    int[] array = new int [10];//new array with length 10
    Random random = new Random();//new random object
    int number=0;//create number
    for (int x=0;x<array.length;x++){//begin for loop
        number=random.nextInt(10);//random number from 1 to 10
        array[x]=number;//store value in array
    }//end for loop for filling array
    return (array);//return the array
}//end of method

public static int[] delete(int[] list,int pos){
    if(!(pos>=0&&pos<list.length)){
        System.out.println("The index was not valid.");
        return (list);
    }
    boolean boo = true;
    if (pos>=0&&pos<list.length){
        int[] array = new int[9];
        for (int x=0;x<list.length;x++){
            if (x==pos){//begin if
                boo=false;
                continue;
            }//end if
            else{//begin else
                if (boo){
                array[x]=list[x];
                }
                else {array[x-1]=list[x];}
            }//end else
        }//end for
        return array;
    }
    return list;
}//end method

public static int[] remove(int[] list,int target){
    int counter=0;
    int othercounter=0;
    for (int x=0; x<list.length;x++){
        if (list[x]==target){
            counter++;
        }
    }
    if (counter==0){
        System.out.println("Element "+target+" has not been found.");
        return list;
    }
    else{System.out.println("Element "+target+" has been found.");}
    int[] array = new int[10-counter];
    for (int x=0; x<list.length;x++){
        if (!(list[x]==target)){
            array[x-othercounter]=list[x];
        }//end if
        else{othercounter++;}
    }//end for
    return array;
}
}