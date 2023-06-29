import java.util.*;  
public class Array   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length n  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements of A are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
int B[] = array.clone();
System.out.println("Cloned array is B");
for(int j=0;j<n;j++)
{
System.out.println(B[j]);
}
sc.close();
}  
}  