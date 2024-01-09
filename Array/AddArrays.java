import java.util.Scanner;

public class AddArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] resultArray = addArrays(array1, array2);

        System.out.println("Resultant Array after addition: ");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    private static int[] addArrays(int[] arr1, int[] arr2) {
        int size = arr1.length;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }
}
