
/*Project was created by Michael-Angelo Georgiou 
Exercise 13 */


import java.util.*;

public class Exercise13_methods{
    
    Scanner input = new Scanner(System.in);
    
    String name ;
    String surname;
    int id;
    double salary;
    
    
    public void getInfo(){

    System.out.println("Enter the name of the employee :");
    name =input.nextLine();
     System.out.println("Enter the surname of the employee :");
    surname =input.nextLine();
      System.out.println("Enter the ID of the employee :");
    id =input.nextInt();
      System.out.println("Enter the salary of the employee :");
    salary =input.nextDouble();
    
    }
    
    public void display(){
        
        System.out.println("Employee :");
        System.out.println("\n" + name +" "+ surname +" with number id "+ id + " and salary  " + salary);
    
    }
    
}