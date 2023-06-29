import java.util.*;
public class revstring {
    public static void rev(String s, int n) {
        if(n==0) {
            System.out.println(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        rev(s,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int n = s.length()-1;
        rev(s,n);
        sc.close();
    }
        
    }
