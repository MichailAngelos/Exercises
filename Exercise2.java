
/*Project was created by Michael-Angelo Georgiou 
Exercise 2 */

import java.util.*;
class Exercise2{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int [] numbers ;
        int i;
        
       System.out.println("Enter the length of the array : ");
       int n =input.nextInt();
       
        numbers = new int [n] ;
        
        for(i=0;i<numbers.length;i++){
            
            System.out.println("Set Values to the array :");
            numbers[i]=input.nextInt();
                    
        }
         for(i=0;i<numbers.length;i++){
        System.out.println("\n Cell ["+i+"]"+"======>"+"\t"+numbers[i]);
         }
        System.out.println("---------->This is your first array <---------");
         
         }
}