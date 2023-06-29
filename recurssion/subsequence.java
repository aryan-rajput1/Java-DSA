import java.util.*;
public class subsequence {
    public static void SubSeq(String s, int n, String str){
        if(s.length() == n){
            System.out.println(str);
            return;
        }
        char curr = s.charAt(n);
        SubSeq(s, n+1, str+curr);
        SubSeq(s, n+1, str);
    }
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a string");
    String s = sc.nextLine();
    SubSeq(s, 0, "");
        sc.close();
    }
}

