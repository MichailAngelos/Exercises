
/*Project was created by Michael-Angelo Georgiou 
Exercise 12 */


public class Exercise12{
    public static void main(String[] args){
        
           Exercise12_ToString employee1 = new Exercise12_ToString("Michael Angelo","Georgiou","Developer",24,"A.T.E.I Thessalonikis");
                Exercise12_ToString employee2 = new Exercise12_ToString("Andreas","Papathanasiou","Technician",28,"University of Essex");
               
                Exercise12_ToString employee3 = new Exercise12_ToString("Theodora","Christou","Make up Artist",23,"T.L. College");

        
        System.out.println("===>Employees of the month<===");
   
           System.out.println(employee1.toString());
           System.out.println("\n"+employee2.toString());
           System.out.println("\n"+employee3.toString());
    }
    
}