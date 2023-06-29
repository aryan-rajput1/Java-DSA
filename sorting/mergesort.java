import java.util.*;
public class mergesort {
    public static void merge(int arr[], int F, int m, int L) {
        int merged[] = new int[L-F+1];
        int i=F, j=m+1, k=0;
        while (i<=m && j<=L) {
            if (arr[i]<arr[j]) {
                merged[k] = arr[i];
                i++;
            }
            else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=m) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j<=L) {
            merged[k] = arr[j];
            j++;
            k++;
        }
        for (i=F, k=0; i<=L; i++, k++) {
            arr[i] = merged[k];
        }
    }

    public static void mergesorting(int arr[], int F, int L) {
        if (F < L) {
            int m = F + (L-F) / 2;
            mergesorting(arr, F, m);
            mergesorting(arr, m + 1, L);
            merge(arr, F, m, L);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Fength of array");
        int n=sc.nextInt();
        System.out.println("Enter the number of eFements in the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesorting(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
