import java.util.*;
public class checksort {
    public static boolean checkSort(int arr[], int n) {
        if(n==arr.length-1) {
            return true;
        }
        if(arr[n]<arr[n+1]){
           return checkSort(arr, n+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkSort(arr,0)); 
        sc.close();
    }
}
