
/*Project was created by Michael-Angelo Georgiou 
Exercise 10 */

class Exercise10{
    
    public static void main(String[]args){
        
    System.out.println("=====>This the average of your number you put as parameter on method<=====");
    
    System.out.println("\n\t\t\t"+"|"+Avg(2,4,5,1,56,14,15,6)+"|");
        
        
    }
  //With this method you can put as much numbers you want as parameter and because of the three dots.
    public static int Avg(int...numbers){
        int total=0;
      
        
        for( int x :numbers ){
            
            total += x;
        }
        
        
    return total/numbers.length;}
}