
/*Project was created by Michael-Angelo Georgiou 
Exercise 15 */


import javax.swing.JOptionPane;


public class Excercise15{
    
    public static void main(String [] args){
        
       JOptionPane.showMessageDialog(null , "Welcome to my Sum programme", "sum" , JOptionPane.PLAIN_MESSAGE);
        
        String N1 = JOptionPane.showInputDialog("Enter your first number");
         String N2 = JOptionPane.showInputDialog("Enter your second number");    
           
         
         int num1 = Integer.parseInt(N1);
          int num2 = Integer.parseInt(N2);
           
           int sum = num1 + num2 ;
          
          
         if (sum > 100){
             
              JOptionPane.showMessageDialog(null , "Your Sum is over 100 is " + sum, "sum" , JOptionPane.PLAIN_MESSAGE);
         } 
         else {
              JOptionPane.showMessageDialog(null , "Your sum is under 100 is "+ sum, "sum" , JOptionPane.PLAIN_MESSAGE);
             
         }
    }
    
    
}