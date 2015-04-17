// Timothy Berrill
// CSe lab 11

import java.util.Scanner;
import java.util.Random;
public class RowAndColumn{
  



//increasing matrix 
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] array = new int[height][];
        if (format){
            int number=1;
            for (int z=0;z<height;z++){
                array[z]=new int[width];
                for (int x=0;x<width;x++){
                array[z][x]=number;
                number++;
                }
            }
        }//end of row generated
        else{
            int number=0;
            for (int z=0;z<height;z++){
                array[z]=new int[width];
                number++;
                for (int x=0;x<width;x++){
                array[z][x]=((height*x)+number);
                }}
        }//end column generation
        printMatrix(array,format);
        return array;
    }//end method
    
    
    
    
//printmatrix
    public static void printMatrix(int[][] array, boolean format){
        if (array==null){
            System.out.print("The array is empty.\n");
            return;
        }
        if (format){
        int counter=0;
            for (int x=0;x<array.length;x++){
                System.out.print("[");
                counter=0;
            while (counter<array[x].length){
                System.out.print(" "+array[x][counter]+" ");
                counter++;}//end the while loop
                System.out.println("]");
            }
        }//end of row format
        else{
            int counter=0;
            for(int x=0;x<array[0].length;x++){
                for(int z=0;z<array.length;z++){
                    if (counter==0){System.out.print("[");}
                    System.out.print(" "+array[z][x]+" ");
                    counter++;
                    if(counter==array[0].length){
                        System.out.println("]");
                        counter=0;
                    }
                }//end second for loop
            }//end first for loop
        }//end of printing column format
        return;
    }//end of method
    
    
    
    
    
//translate
    public static int[][] translate(int[][] array){
        int[][] newArray=new int[array.length][array[0].length];
        int counter=0;
        int counter2=0;
        for(int x=0;x<array[0].length;x++){
            for(int z=0;z<array.length;z++){
                if(counter2==array.length){
                    counter2=0;}
                newArray[counter2][counter]=array[z][x];
                counter2++;
                }//end second for loop
                counter++;
            }//end first for loop
        int[][] finalArray = new int[newArray.length][newArray[0].length];
        int first=0;
        int second=0;
        for (int outer=0;outer<newArray[0].length;outer++){
            for(int inner=0;inner<newArray.length;inner++){
                finalArray[first][second]=newArray[inner][outer];
                second++;
                if (second>=finalArray[0].length){
                    second=0;
                    first++;}
            }
        }
            
            return finalArray;
        }//end method
    
    
    
    
//add matrix
    public static int[][] addMatrix(int[][] array1,boolean format1,int[][] array2,boolean format2){
        if (!(array1.length==array2.length&&array1[0].length==array2[0].length)){
            System.out.println("The arrays cannot be added!");
            return null;
        }
        int[][] arrayfinal=new int[array1.length][array1[0].length];


        System.out.println("Adding two matrices: ");
        printMatrix(array1,true);
        System.out.println("Plus:");
        if(!format1){array1=translate(array1);
            System.out.println("translating matrix 1");
        }
        printMatrix(array2,true);
        if(!format2){array2=translate(array2);
            System.out.println("translating matrix 2");
        }
        System.out.println("output: ");
        int counter=0;
        for (int x=0;x<array1.length;x++){
            counter=0;
        while (counter<array1[x].length){
            arrayfinal[x][counter]=array1[x][counter]+array2[x][counter];
            counter++;
        }
        }
        return arrayfinal;
    }//end method
    
    
    
    
//main
    public static void main(String[] args){
        Random random=new Random();
        int height1=random.nextInt(7)+1; int height2=random.nextInt(7)+1;
        int width1=random.nextInt(7)+1; int width2=random.nextInt(7)+1;
        System.out.println("Generating matrix with height "+height1+" and width "+
        width1+".");
        int[][] array1=increasingMatrix(width1,height1,true);
        System.out.println("Generating matrix with height "+height1+" and width "+
        width1+".");
        int[][] array2=increasingMatrix(width1,height1,false);
        System.out.println("Generating matrix with height "+height2+" and width "+
        width2+".");
        int[][] array3=increasingMatrix(width2,height2,true);
        System.out.println("\n\n");
        int[][] arrayfinal= addMatrix(array1,true,array2,false);
        printMatrix(arrayfinal,true);
        addMatrix(array1,true,array3,true);
        
    }
}//end class