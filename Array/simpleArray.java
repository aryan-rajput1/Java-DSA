import java.util.*;
public class simpleArray {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array");
        
        int a=s.nextInt();
        int arr[] = new int [a];
        System.out.println("Enter the array");
        for (int i=0;i<a;i++){
            arr[i]=s.nextInt();
           
        }
        for (int i=0;i<a;i++){
            System.out.println("Value at "+(i+1)+" is "+arr[i]);
        }
        s.close();
}
}
