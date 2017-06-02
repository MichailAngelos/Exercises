/*Project was created by Michael-Angelo Georgiou 
Exercise 14 */

import java.util.*;

public class Exercise14{
    

    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
       
        int guess;
        int Array1 [] = new int [10];
        
             int counter =0; 
            int i ;
        
            for (i=0;i<Array1.length;i++){
                
                Array1[i] = (int)(Math.random() *10);
           
            }  
                 
          
          
           for (i=0;i<Array1.length;i++){
                
                  
           
                  System.out.print( Array1[i] + " ");
            }
         
        System.out.print(" ----Array before sorting-----");
              
             System.out.println("\n");
                
             ShowMenu();
       
             
           try{
               
         int x = input.nextInt();
      

       
             switch(x){
             case 1:  
              Sorting.BSort(Array1);  
               System.out.println("----Array after Bubble Sort-----");  
                System.out.println("Array : "); 
               for(i=0;i<Array1.length;i++){
               
                   System.out.print(  Array1[i] + " ");  
              }
                   System.out.println(" "); 
          break;
      
           case 2:  
              Sorting.InsSort(Array1);  
               System.out.println("----Array after Insert Sort-----");  
               System.out.println("Array : "); 
               for(i=0;i<Array1.length;i++){
               
                 System.out.print(  Array1[i] + " ");   
              }
                    System.out.println(" ");                            

          break;
       
           case 3:  
              Sorting.SelSort(Array1);  
               System.out.println("----Array after Selection Sort-----");  
              System.out.println(" Array : ");  
               for(i=0;i<Array1.length;i++){
               
          System.out.print(  Array1[i] + " ");   
              }
                System.out.println(" ");   
          break;
       
       
       }       
         
        
        
           }  catch(Exception e){
          
               System.out.println("Wrong Try again");
            
               ShowMenu();
                           
        }
        
    
          
    }
    
    public static void ShowMenu(){
        
         System.out.println("----Choose the Sort method you want for the array-----");
          System.out.println("1.Bubble Sort");
           System.out.println("2.Insert Sort");
            System.out.println("3.Selection Sort");
            System.out.println("Choose one of the 3 options :");
   
    }
    
        
         }

    

    
    
