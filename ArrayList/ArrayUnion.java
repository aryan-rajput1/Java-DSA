import java.util.*;

public class ArrayUnion {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (i == 0 || a[i] != a[i - 1]) {
                    union.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (j == 0 || b[j] != b[j - 1]) {
                    union.add(b[j]);
                }
                j++;
            } else {
                if (i == 0 || a[i] != a[i - 1]) {
                    union.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                union.add(a[i]);
            }
            i++;
        }
        
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                union.add(b[j]);
            }
            j++;
        }
        
        return union;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 4, 4, 5};
        
        ArrayList<Integer> union = findUnion(a, b);
        System.out.println("Union: " + union);
    }
}
