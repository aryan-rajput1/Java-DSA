import java.util.Scanner;
// linear search example
public class findnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        num = sc.nextInt();
        for (int j = 0; j < n; j++) {
            if (arr[j] == num) {
                System.out.println("number found at" + " " + j);
                continue;
            } else {
                continue;
            }
        }
        sc.close();
    }

}
