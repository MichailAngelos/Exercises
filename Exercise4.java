
/*Project was created by Michael-Angelo Georgiou 
Exercise 4 */


import java.util.*;

class Exercise4{
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        int [] niaou ;
        int i;
        System.out.println("Enter the length of the array ====>");
        int n=input.nextInt();
        
        niaou = new int [n];
              
             for(i=0;i<niaou.length;i++){
                 System.out.println("Give numbers for the array :");
                 niaou[i]=input.nextInt();
                
             } 
        System.out.println("========> This is the array you just made <=======");
           System.out.println("|Cells|\t|Values|");
    
    for(i=0;i<niaou.length;i++){
        
          System.out.println("  ["+i+"]" + "\t"+niaou[i]);
    }
    }
}