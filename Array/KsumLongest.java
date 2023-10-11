import java.util.*;
public class KsumLongest {
    public static int ksum(int[] arr,int n, int k){
        int sum = 0;
        int maxlength = 0;
        // Brute force approach
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int l=i; l<j; l++){
                    sum += arr[l];
                    if(sum == k){
                       int length = j-i+1;
                       if(length>maxlength){
                           maxlength = length;
                       } 
                    }
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n; int k;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        System.out.println("Enter k");
        k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(ksum(arr,n, k));
    }
}
