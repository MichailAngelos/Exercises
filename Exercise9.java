/*This project was created by Michael-Angelo Georgiou 
Exercise 9 */


import java.util.*;

class Exercise9{
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
         int num1,num2;
         int x = 1;
        double div ;

         do{
            try{
                
                System.out.println("Enter number 1 : ");
                num1=input.nextInt();
                
                   System.out.println("Enter number 2 : ");
                   num2=input.nextInt();
                
                   if(num1<num2){
                       
                       int temp = num1;
                       num1=num2;
                       num2=temp;
                       
                   }
                   
                   div = num1 /num2;
                   
                  System.out.println("This is the result of your division ====> "+ div);
                  
          x=2;      
                
            }catch(Exception e){
                
                System.out.println("=====> Something went wrong with your input please try again <=====");
            }
             
             
             
         }while(x==1);
         
         
    }
    

 
}