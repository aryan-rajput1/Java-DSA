import java.util.*;

public class RotateByK {
    static void rotateArray(int[] arr, int n, int k) {
        if(k>n){
		k = k % n;} // To handle cases where k is larger than n

        // Create a new array to store the rotated elements
        int[] rotatedArr = new int[n];
        
        // Copy elements from the original array to the rotated array
        for (int i = 0; i < n; i++) {
            int newPosition = (i + n - k)%n; // Calculate the new position after rotation
            rotatedArr[newPosition] = arr[i];
        }

        for(int i=0;i<n;i++){
			System.out.print(rotatedArr[i]);
		}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int k = scanner.nextInt();
        rotateArray(array, n, k);

        scanner.close();
    }
}
