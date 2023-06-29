import java.util.*;
public class charatfun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        int n = s.length();
        for(int i =0;i<n;i++){
            System.out.println(s.charAt(i));
        }
        sc.close();
    }
}
