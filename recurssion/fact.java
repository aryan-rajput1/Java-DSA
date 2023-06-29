import java.util.*;
public class fact {
    public static int factn(int i, int n, int fact){
       if(n==1 || n==0){
        System.out.println("1");
        return 1;
       }
        if(i==n){
            fact=fact*i;
            System.out.println(fact);
            return 1;
        }
        fact=fact*i;
        factn(i+1,n,fact);
        System.out.println(i);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int i=1;
        factn(i,n,prod);
        sc.close();
    }
}
