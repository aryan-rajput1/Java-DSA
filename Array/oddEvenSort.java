// import java.util.ArrayList;
// import java.util.List;

// public class oddEvenSort {

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 7, 1, 9, 6, 8, 5};

//         System.out.println("Original Array: " + arrayToString(arr));

//         sortEvenOdd(arr);

//         System.out.println("Sorted Array with Even Numbers First: " + arrayToString(arr));
//     }

//     private static void sortEvenOdd(int[] arr) {
//         List<Integer> evenNumbers = new ArrayList<>();
//         List<Integer> oddNumbers = new ArrayList<>();

//         // Separate even and odd numbers
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 evenNumbers.add(num);
//             } else {
//                 oddNumbers.add(num);
//             }
//         }

//         // Copy even and odd numbers back to the original array
//         int index = 0;
//         for (int even : evenNumbers) {
//             arr[index++] = even;
//         }
//         for (int odd : oddNumbers) {
//             arr[index++] = odd;
//         }
//     }

//     private static String arrayToString(int[] arr) {
//         StringBuilder sb = new StringBuilder("[");
//         for (int i = 0; i < arr.length; i++) {
//             sb.append(arr[i]);
//             if (i < arr.length - 1) {
//                 sb.append(", ");
//             }
//         }
//         sb.append("]");
//         return sb.toString();
//     }
// }

import java.util.*;
public class oddEvenSort {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int[] Earr = new int[n];
    int[] Oarr = new int[n];
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            Earr[i] = arr[i];
        } else {
            Oarr[i] = arr[i];
        }
    }
    int s = Earr.length + Oarr.length;
    int[] Resarr = new int[s];
    for(int i=0; i<Earr.length; i++){
        Resarr[i] = Earr[i];
    }
    for(int i=0; i<Oarr.length; i++){
        Resarr[Earr.length+i] = Oarr[i];
    }
    for(int i=0; i<Resarr.length; i++){
        System.out.println(Resarr[i]);
    }
    sc.close();
    }
}
