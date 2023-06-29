import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        System.out.println("Enter elements of array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int s = sc.nextInt();
        for (i = 0; start <= end; i++) {
            if (s == arr[mid]) {
                System.out.println("Index: " + (mid + 1));
                break;
            } else if (s < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        sc.close();
    }
}
