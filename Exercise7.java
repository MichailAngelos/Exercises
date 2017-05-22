/*Project was created by Michael-Angelo Georgiou 
Exercise 2 */


class Exercise7{
    
    public static void main(String [] args){
        
       int array1 [] [] = {{2,5,1,5,6},{1,45,5,2,4},{1,2,49,2},{4,3,6}};
        int array2 [] [] ={{1,34,5,6 },{3,4,5,6,7},{1,3,4,5,6,7},{3,2,1}};
     
        System.out.println("This is my first multidimensional array ----> ");
        display(array1);
      
           System.out.println("\nThis is my second multidimensional array ----> ");
           display(array2);
      
    
    }

    
public static void display(int x[][]){
    
        for (int row=0;row<x.length;row++) {
        for(int column=0;column<x[row].length;column++){
            
            System.out.print(x[row][column]+"\t");
        }
        System.out.println();
        }
    
}

}