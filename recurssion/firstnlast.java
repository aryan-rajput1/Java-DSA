import java.util.*;
public class firstnlast {
    public static int first = -1;
    public static int last = -1;
    public static void fnloccurance(String s, int n, char element) {
       
        if(n==s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char ch = s.charAt(n);
        if(ch == element) {
            if(first == -1){
                first = n;
            }
            else{
                last = n;
            }
        }
        fnloccurance(s, n+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the character");
        char element = sc.next().charAt(0);
        int n = 0;
        fnloccurance(s, n, element);
        sc.close();
    }   
    }
