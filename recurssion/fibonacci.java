import java.util.*;
public class fibonacci {
    public static void fibo(int first, int sec, int n){
        if(n==0){
            return;
        }
        System.out.println(first+sec);
        fibo(sec,first+sec,n-1);
    }
    public static void main(String[] args){
        int first= 0;
        int sec = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(first, sec, n-2);
        sc.close();
    }
}
