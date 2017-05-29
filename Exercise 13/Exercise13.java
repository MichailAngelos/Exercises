
/*Project was created by Michael-Angelo Georgiou 
Exercise 13 */

//Array holding Objects

public class Exercise13{
    
    public static void main(String[]args){
        int i;
        Exercise13_methods emp [] = new  Exercise13_methods [5];
       
        
        for(i=0;i<emp.length;i++){
            
            emp[i]= new Exercise13_methods();
        }
        
    for(i=0;i<emp.length;i++){
        
        System.out.println("Enter the details for the employee ");
        emp[i].getInfo();
        
    }
    
    
    for(i=0;i<emp.length;i++){
        
        emp[i].display();
    }
        
    
    }
}