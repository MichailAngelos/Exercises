/*Project was created by Michael-Angelo Georgiou 
Exercise 3 */


class Exercise3 {
 public static void main(String args[]) {
 int Ar[][]= new int[4][5];
 int i, j, k = 0;
 
 
          for(i=0; i<4; i++)
           for(j=0; j<5; j++) {
              Ar[i][j] = k;
                      k++;
                       }
 
 
 
              for(i=0; i<4; i++) {
                   for(j=0; j<5; j++)
 
                    System.out.print(Ar[i][j] + " ");
                      System.out.println();
 }
 }
}
  
  