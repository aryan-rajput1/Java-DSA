// calculate length of string without using length() method
import java.util.*;
public class lenOfstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = 0;
        for (char arr : str.toCharArray()) {
            System.out.println(arr);
            len++;
        }
        System.out.println(len);
        sc.close();
    }
}
