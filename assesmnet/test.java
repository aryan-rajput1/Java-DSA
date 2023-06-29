 import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = 1;
            }
            boolean aliceWins = true;
            while (true) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] > 0) {
                        cnt++;
                    }
                }
                if (cnt == 1) {
                    break;
                }
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (a[i] == a[j]) {
                            a[i] = a[j] = a[i] + a[j];
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
                if (!found) {
                    aliceWins = !aliceWins;
                    break;
                }
            }
            System.out.println(aliceWins ? "Alice" : "Bob");
        }
        sc.close();
    }
}


