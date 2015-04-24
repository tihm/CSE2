// Timothy Berrill
// CSE 02 lab 13 ragged array practice

import java.util.Random;

public class ragged{
    
    public static void main(String[] args){//
        int[][] ragged=new int[5][];
        Random random = new Random();



//CREATING AND PRINTING  
        System.out.println("\n\nThe array before sorting: ");
        for (int x=0; x<ragged.length;x++){
            ragged[x]=new int[x*3+5];
            int c=x+1;
            System.out.print("Row: "+c+" [");
            for(int z=0; z<ragged[x].length;z++){
                ragged[x][z]=random.nextInt(40);
                if (ragged[x][z]<10){
                    System.out.print(" "+ragged[x][z]+"  ");}
                else{
                    System.out.print(" "+ragged[x][z]+" ");
                }
            }
            System.out.print("]\n");}
            
            
            
// SORTING  
        for (int x=0;x<ragged.length;x++){
            int smallest = 34567;
            int position = 0;
            int temp=0;
            for (int z=0;z<ragged[x].length;z++){
                
                smallest=345678;
                for (int y=z;y<ragged[x].length;y++){
                if (ragged[x][y]<=smallest){
                    smallest = ragged[x][y];
                    position = y;}}
                    
                temp=ragged[x][z];
                ragged[x][z]=smallest;
                ragged[x][position]=temp;
                position=0;temp=0;}
        }
                
                
                
// PRINT SORTED ARRAY
        System.out.print("\n\nThe array after being sorted: \n");
        for (int x=0; x<ragged.length;x++){
            int c=x+1;
            System.out.print("Row: "+c+" [");
            for(int z=0; z<ragged[x].length;z++){
                if (ragged[x][z]<10){
                    System.out.print(" "+ragged[x][z]+"  ");}
                else{
                    System.out.print(" "+ragged[x][z]+" ");} 
                }
            System.out.print("]\n");}      



// COPY
        for(int x=0;x<ragged.length;x++){
            int[] temp=new int[ragged[4].length];
            for (int z=0;z<ragged[x].length;z++){
                temp[z]=ragged[x][z];
            }
            ragged[x]=temp;
        }
        System.out.print("\n\nThe array after being sorted and copied: \n");
        for (int x=0; x<ragged.length;x++){
            int c=x+1;
            System.out.print("Row: "+c+" [");
            for(int z=0; z<ragged[x].length;z++){
                if (ragged[x][z]<10){
                    System.out.print(" "+ragged[x][z]+"  ");}
                else{
                    System.out.print(" "+ragged[x][z]+" ");}
            }
            System.out.print("]\n");}
    }//end main method
}