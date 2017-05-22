
/*Project was created by Michael-Angelo Georgiou 
Exercise 5 */

//Fill arrays with random numbers

import java.util.*;



public class Exercise5{

public static void main(String [] args){

    
 Array1method();
 Array2method();

} 


    
public static void Array1method() {
 int cells=getRandom();
 System.out.println("Firts array with one dimension "+ cells + " cells");
 System.out.println("\n <========================================>");
 int[] Array = new int[cells];
 for(int i=0;i<Array.length;i++) Array[i]=getRandom();
 System.out.println("Show of the array with one dimension ");
 for(int i=0;i<Array.length;i++) System.out.println(" Cell[" + i + "] = "+ Array[i]);
 System.out.println();
}

public static void Array2method() {
 int x,y;
 x=getRandom();
 y=getRandom();
 System.out.println("Creation of array with two dimensios " + x + " * " + y + " = " + (x*y) + " cells");
 System.out.println("\n<==============================================>");
 int[][] Array = new int[x][y];
 for(int i=0;i<x;i++)
 for(int j=0;j<y;j++) Array[i][j]=getRandom();
 System.out.println(" Show of the array with two dimensions ");
 for(int i=0;i<x;i++){
 for(int j=0;j<y;j++) System.out.println(" Cell[" + i + "]["+ j + "] = " + Array[i][j]);
 System.out.println();}
}

//int max 10
private static int getRandom() {
 Random rand = new Random();
 return rand.nextInt(10);        


}
}


   
    
