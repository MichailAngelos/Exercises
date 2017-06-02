/*Project was created by Michael-Angelo Georgiou 
Exercise 14 */

public class Sorting extends Exercise14 {
    
    //Bubble Sort
      public static void BSort(int[] A) 
{
int i, j;
int temp;
boolean flag;
for (i=1; i < A.length; i++) {
flag=true;
for (j=0; j < A.length
-
i; j++)
if (A[j] > A[j+1])
{
temp=A[j];
A[j]= A[j+1];
A[j+1]=temp;
flag=false;
}
if (flag) 
    return; }

}
    //Insert Sort  
     public static void InsSort(int[] A) {
for (int i=1; i< A.length; i++){ 
    int current = A[i];int j=i;
while (j>0 && A[j-1] > current) { 
    A[j] = A[j-1];j--;}
A[j] = current; 
} }

//Selection Sort
public static void SelSort(int[] A) {
int pos, temp;
for (int i = 0; i < A.length
-
1; i++){

    
pos=i;
for (int k=i+1; k<A.length; k++)
if (A[k] < A[pos]) pos=k;


temp = A[pos];
A[pos] = A[i];
A[i] = temp; } } 

}