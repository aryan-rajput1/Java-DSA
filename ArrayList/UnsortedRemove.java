import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnsortedRemove {
     public static void removeDuplicates(ArrayList<Integer> unsortedList) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer element : unsortedList) {
            if (uniqueElements.add(element)) {
                newList.add(element);
            }
        }

        unsortedList.clear();
        unsortedList.addAll(newList);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ArrayList<Integer> unsortedArrayList = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int numElements = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = sc.nextInt();
            unsortedArrayList.add(element);
        }

        System.out.println("Original ArrayList: " + unsortedArrayList);
        removeDuplicates(unsortedArrayList);
        System.out.println("ArrayList after removing duplicates: " + unsortedArrayList);
        sc.close();
    }
}
