/*Project was created by Michael-Angelo Georgiou 
Exercise 8 */




import java.util.*;

public class Exercise8{
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
       
        
         System.out.print("Enter your weight in KG :");
         
         int weight=input.nextInt();
         
          System.out.print("Enter your height in M :");
          
          double height = input.nextDouble();
          
          double x = weight /  (height * height);
          
         if(x < 18.5){
             System.out.println("You need to get some weight , go get some food son :D ");
             
             }
         else if ( x < 25.0){
             
            System.out.println("You are absolutely normal Congrats , " + " Your body BMI IS :" + x);
             
         }
         else if (x < 30 ){
             
             System.out.println("Be carefull you may need to lose some KG ; ,  " + " Your body BMI IS :" + x);
         }
         else if( 30 < x ){
             System.out.println("You are in a dangerous zone get now to gym your BMI is over 30.0 :/ , " + " Your body BMI IS :" + x);
             
         }
         else {
             System.out.println("Something went wrong run the programme again  , " + " Your body BMI IS :" + x);
         }
        
        
        
        
    }

}